from collections import deque

# line = 0, column = 0, nlines = 2, ncolumns = 2
def build_distance_matrix(line, column, grid, matrix, nlines, ncolumns):
	queue = deque([(line, column, 0)])
	directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
	while len(queue) > 0:
		i, j, distance = queue.popleft()
		matrix[i][j] = min(matrix[i][j], distance)
		for direction in directions:
			new_i, new_j = i + direction[0], j + direction[1]
			if (
				new_i < 0 or new_i >= nlines
				or new_j < 0 or new_j >= ncolumns
				or matrix[new_i][new_j] <= distance + 1
				or grid[new_i][new_j] == 2
				or grid[new_i][new_j] == 1
			): continue
			queue.append((new_i, new_j, distance + 1))

def build_distance_matrices(grid, nlines, ncolumns):
	matrices = []
	for i in range(nlines):
		for j in range(ncolumns):
			if grid[i][j] == 1:
				matrix = [[float('inf') for _ in range(ncolumns)] for _ in range(nlines)]
				build_distance_matrix(i, j, grid, matrix, nlines, ncolumns)
				matrices.append(matrix)
	return matrices

def get_shortest_amount_of_distance(grid):
	nlines = len(grid)  # 2
	ncolumns = len(grid[0])  # 2
	matrices = build_distance_matrices(grid, nlines, ncolumns)
	min_distance = float('inf')
	for i in range(nlines):
		for j in range(ncolumns):
			if grid[i][j] == 1 or grid[i][j] == 2: continue
			curr_distance = 0
			for matrix in matrices:
				curr_distance += matrix[i][j]
			if curr_distance > 0:
				min_distance = min(min_distance, curr_distance)
	return -1 if min_distance == float('inf') else min_distance

grid = [
	[1,2],
	[2,0]
]
assert get_shortest_amount_of_distance(grid) == -1

grid = [
	[1,0],
	[0,0]
]
assert get_shortest_amount_of_distance(grid) == 1

grid = [
	[1,0,2,0,1],
	[0,0,0,0,0],
	[0,0,1,0,0]
]
assert get_shortest_amount_of_distance(grid) == 7

class GameOfLife:
	def __init__(self, board):
		self.board = board
		self.nlines = len(board)
		self.ncolumns = len(board[0])
		self.directions = [
			(-1, 1),
			(0, 1),
			(1, 1),
			(1, 0),
			(1, -1),
			(0, -1),
			(-1, -1),
			(-1, 0),
		]
		self.create_live_neighbors()

	def out_of_bounds(self, i, j):
		return i < 0 or i >= self.nlines or j < 0 or j >= self.ncolumns

	def get(self, i, j):
		return 0 if self.out_of_bounds(i, j) else self.live_neighbors[i][j]

	def update(self, i, j, new_value):
		if self.out_of_bounds(i, j): return
		self.live_neighbors[i][j] = new_value

	def update_neighbors(self, i, j, delta):
		for direction in self.directions:
			new_i = i + direction[0]
			new_j = j + direction[1]
			new_value = self.get(new_i, new_j) + delta
			self.update(new_i, new_j, new_value)

	def create_live_neighbors(self):
		self.live_neighbors = [[0] * self.ncolumns for _ in range(self.nlines)]
		for i in range(self.nlines):
			for j in range(self.ncolumns):
				if self.board[i][j] == 1:
					self.update_neighbors(i, j, 1)

	def play(self):
		old_live_neighbors = [row.copy() for row in self.live_neighbors]
		for i in range(self.nlines):
			for j in range(self.ncolumns):
				if self.board[i][j] == 1:
					if old_live_neighbors[i][j] < 2 or old_live_neighbors[i][j] > 3:
						self.update_neighbors(i, j, -1)
						self.board[i][j] = 0
				elif old_live_neighbors[i][j] == 3:
					self.update_neighbors(i, j, 1)
					self.board[i][j] = 1

board = [
	[1, 1],
	[1, 0],
]
game = GameOfLife(board)

game.play()
next_board = [
	[1, 1],
	[1, 1],
]
assert str(game.board) == str(next_board)

game.play()
next_board = [
	[1, 1],
	[1, 1],
]
assert str(game.board) == str(next_board)


board = [
	[0, 1, 0],
	[0, 0, 1],
	[1, 1, 1],
	[0, 0, 0],
]
game = GameOfLife(board)

game.play()
next_board = [
	[0, 0, 0],
	[1, 0, 1],
	[0, 1, 1],
	[0, 1, 0],
]
assert str(game.board) == str(next_board)

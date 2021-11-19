def find_longest_line_of_consecutive_one(matrix):
	nlines = len(matrix)
	ncolumns = len(matrix[0])
	longest = float('-inf')
	dp_horizontal = [0] * nlines
	dp_vertical = [0] * ncolumns
	dp_main_diag = [0] * (nlines + 1)
	dp_anti_diag = [0] * (nlines + 1)

	def get_cell(i, j):
		return 0 if i < 0 or i >= nlines or j < 0 or j > ncolumns else matrix[i][j]

	for i in range(nlines):
		for j in range(ncolumns):
			dp_horizontal[i] = 0 if matrix[i][j] == 0 else dp_horizontal[i] + 1
			dp_vertical[j] = 0 if matrix[i][j] == 0 else dp_vertical[j] + 1
			dp_main_diag[i + 1] = 0 if get_cell(i - 1, j - 1) == 0 else dp_main_diag[i] + 1
			dp_anti_diag[i + 1] = 0 if get_cell(i - 1, j + 1) == 0 else dp_anti_diag[i] + 1
			longest = max(
				longest,
				dp_horizontal[i],
				dp_vertical[j],
				dp_main_diag[i + 1],
				dp_anti_diag[i + 1],
			)
	return longest

matrix = \
[[0,1,1,0],
 [0,1,1,0],
 [0,0,0,1]]

assert find_longest_line_of_consecutive_one(matrix) == 3

class FenwickTree:
    def __init__(self, array) -> None:
        self.array = array
        self.update_index = -1
        self.build_tree()

    def update(self, index, value, building=False):
        old_val = self.array[index] if not building else 0
        self.array[index] = value
        index += 1
        while index < len(self.tree):
            self.tree[index] += -old_val + value
            index += -index & index

    def build_tree(self):
        self.tree = [0] * (len(self.array) + 1)
        for i in range(len(self.array)):
            self.update(i, self.array[i], building=True)

    def sum(self, i):
        sum = 0
        i += 1
        while i > 0:
            sum += self.tree[i]
            i -= -i & i
        return sum

    def sum_range(self, left, right):
        return self.sum(right) - (self.sum(left - 1) if left - 1 >= 0 else 0)

class NumMatrix:
    def __init__(self, matrix):
        self.matrix = matrix
        self.nlines = len(matrix)
        self.ncolumns = len(matrix[0])
        self.tree = FenwickTree([elem for row in matrix for elem in row])

    def to_1d(self, i, j):
        return i * self.ncolumns + j

    def tree_sum(self, i, j):
        return self.tree.sum(self.to_1d(i, j)) if i >= 0 and j >= 0 else 0

    def sumRegion(self, row1, col1, row2, col2):
        return (
            self.tree_sum(row2, col2)
            - self.tree_sum(row2, col1 - 1)
            - self.tree_sum(row1 - 1, col2)
            + self.tree_sum(row1 - 1, col1 - 1)
        )

    def update(self, row, col, new_val):
        self.tree.update(self.to_1d(row, col), new_val)

matrix = NumMatrix([
    [3,0,1,4,2],
    [5,6,3,2,1],
    [1,2,0,1,5],
    [4,1,0,1,7],
    [1,0,3,0,5],
])

assert matrix.sumRegion(2,1,4,3) == 8
assert matrix.sumRegion(1,1,2,2) == 11
assert matrix.sumRegion(1,2,2,4) == 12
matrix.update(3,2,2)
assert matrix.sumRegion(2,1,4,3) == 10

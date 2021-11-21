class Node:
	def __init__(self, val = 0, right = None, left = None) -> None:
		self.val = val
		self.right = right
		self.left = left

def get_longest_consecutive_path(root):
	def dfs(node):  # node = 1
		increasing, decreasing, max_path = 1, 1, 1  # 2, 1, 2
		left_decreasing, left_increasing = False, False  # False, True
		right_decreasing, right_increasing = False, False  # False, False
		increasing_l, decreasing_l, max_path_l = 0, 0, 0
		increasing_r, decreasing_r, max_path_r = 0, 0, 0
		if node.left:
			increasing_l, decreasing_l, max_path_l = dfs(node.left)
			max_path = max(max_path, max_path_l)
			if abs(node.val - node.left.val) == 1:
				if node.left.val <= node.val:
					left_decreasing = True
					decreasing = max(decreasing, 1 + decreasing_l)
				if node.left.val >= node.val:
					left_increasing = True
					increasing = max(increasing, 1 + increasing_l)
		if node.right:
			increasing_r, decreasing_r, max_path_r = dfs(node.right)
			max_path = max(max_path, max_path_r)
			if abs(node.val - node.right.val) == 1:
				if node.right.val <= node.val:
					right_decreasing = True
					decreasing = max(decreasing, 1 + decreasing_r)
				if node.right.val >= node.val:
					right_increasing = True
					increasing = max(increasing, 1 + increasing_r)
		if (
			node.left and node.right
			and abs(node.val - node.left.val) == 1
			and abs(node.val - node.right.val) == 1
		):
			if left_increasing and right_decreasing:
				max_path = max(max_path, 1 + increasing_l + decreasing_r)
			if left_decreasing and right_increasing:
				max_path = max(max_path, 1 + decreasing_l + increasing_r)
		max_path = max(max_path, increasing, decreasing)
		return increasing, decreasing, max_path
	return dfs(root)[2]

root = Node(0)
assert get_longest_consecutive_path(root) == 1

root = Node(
	0,
	Node(1)
)
assert get_longest_consecutive_path(root) == 2

root = Node(
	0,
	Node(1),
	Node(2)
)
assert get_longest_consecutive_path(root) == 2

root = Node(
	1,
	Node(2),
	Node(0)
)
assert get_longest_consecutive_path(root) == 3

root = Node(
	4,
	None,
	Node(
		2,
		Node(
			3,
			Node(4)
		),
		Node(
			3,
			None,
			Node(1)
		)
	)
)
assert get_longest_consecutive_path(root) == 3

def get_min_cost_path(A, steps):
	min_cost = float('inf')
	best_path = None
	path = []
	def dfs(pos, cost):
		nonlocal min_cost
		nonlocal best_path
		if pos == len(A):
			if cost < min_cost:
				best_path = path.copy()
				min_cost = cost
			return
		path.append(pos + 1)
		for i in range(1, steps + 1):
			if pos + i > len(A): continue
			if pos + i < len(A) and A[pos + i] == -1: continue
			next_cost = cost + (A[pos + i] if pos + i < len(A) else 0)
			dfs(pos + i, next_cost)
		path.pop()
	dfs(0, 0)
	return best_path

A = [1,2,4,-1,2]
steps = 2
assert get_min_cost_path(A, steps) == [1,3,5]

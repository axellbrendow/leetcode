from collections import defaultdict

def build_graph(edges):
	graph = defaultdict(list)
	for edge in edges:
		graph[edge[0]].append(edge[1])
		if not edge[1] in graph:
			graph[edge[1]] = []
	return graph

def has_cycle(graph):
	visited = [False] * len(graph)

	def dfs(node):
		visited[node] = True
		for child in graph[node]:
			if visited[child]: return True
			dfs(child)
		visited[node] = False

	for node in graph:
		if dfs(node): return True
	return False

def is_valid_tree(num_nodes, edges):
	if len(edges) != num_nodes - 1: return False
	graph = build_graph(edges)
	return not has_cycle(graph)

assert is_valid_tree(5, [[0, 1], [0, 0], [2, 3]]) == False
assert is_valid_tree(5, [[0, 1], [0, 2], [0, 3], [1, 4]]) == True
assert is_valid_tree(5, [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]]) == False
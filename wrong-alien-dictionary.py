def create_graph(words):
	graph = {}
	for word in words:
		for i in range(1, len(word)):
			if not word[i] in graph:
				graph[word[i]] = set()
			if not word[i - 1] in graph:
				graph[word[i - 1]] = set()
			graph[word[i - 1]].add(word[i])
	return graph

def find_order(words):
	graph = create_graph(words)
	visited = {node: False for node in graph}

	def dfs(node):
		max_nodes_str = ''
		visited[node] = True
		for child in graph[node]:
			if visited[child]: continue
			nodes_str = dfs(child)
			if len(nodes_str) > len(max_nodes_str):
				max_nodes_str = nodes_str
		visited[node] = False
		return node + max_nodes_str

	for node in graph:
		nodes_str = dfs(node)
		if len(nodes_str) == len(graph):
			return nodes_str
	return ''

assert find_order(['a', 'bc', 'ce', 'db', 'da', 'bw', 'zc', 'wc', 'ed', 'wa']) == 'zcedbwa'
assert find_order(['a', 'bc', 'ce', 'db', 'da', 'bw', 'zc', 'wc', 'wa']) == ''

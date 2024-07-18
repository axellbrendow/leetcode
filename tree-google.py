#                 A
#         F               B
#     G       H       C       D
# W

# Removing F:

#                 A
#        G       H        B
#     W               C       D

def remove_one_node(tree, index):
    for i in range(len(tree)):
        if tree[i][1] > index:
            tree[i] = (tree[i][0], tree[i][1] - 1)
        elif tree[i][1] == index:
            tree[i] = (tree[i][0], tree[index][1])
    tree.pop(index)


tree = [('A', 0), ('F', 0), ('B', 0), ('G', 1),
        ('H', 1), ('C', 2), ('D', 2), ('W', 3)]
index = 1
output = [('A', 0), ('B', 0), ('G', 0), ('H', 0), ('C', 1), ('D', 1), ('W', 2)]
remove_one_node(tree, index)
assert tree == output


def get_first_child(tree, node):
    for i in range(node + 1, len(tree)):
        if tree[i][1] == node:
            return i
    return -1


def remove_subtree(tree, root_index):
    def dfs(node):
        child = get_first_child(tree, node)
        while child != -1:
            dfs(child)
            child = get_first_child(tree, node)
        remove_one_node(tree, node)
    dfs(root_index)


tree = [('A', 0), ('F', 0), ('B', 0), ('G', 1),
        ('H', 1), ('C', 2), ('D', 2), ('W', 3)]
root_index = 1
output = [('A', 0), ('B', 0), ('C', 1), ('D', 1)]
remove_subtree(tree, root_index)
assert tree == output

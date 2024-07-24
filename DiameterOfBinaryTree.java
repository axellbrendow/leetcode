/*-
https://leetcode.com/problems/diameter-of-binary-tree/description/

1
    5
  2
    4

if null return 0, -1
if null return 0, -1
my_diameter = 0 + 0 + 0 + 0 = 0
return max(my_diameter, left_diameter, right_diameter), max(1 + left_longest_path, 1 + right_longest_right)
return 0, 0

diameter that passes through the root = Math.max(maxDiameter, 1 + leftLongestPath + 1 + rightLongestPath)

  3
1
    5
  2
    4
result = 3, [3, 1, 2, 4] or [3, 1, 2, 5]

  3
1
      7
    5
  2
    4
result = 4, [3, 1, 2, 5, 7]
*/

public class DiameterOfBinaryTree {
  private int maxDiameter;

  public int diameterOfBinaryTreeRec(TreeNode root) {
    if (root == null) return -1;
    int leftLongestPath = diameterOfBinaryTreeRec(root.left);
    int rightLongestPath = diameterOfBinaryTreeRec(root.right);
    maxDiameter = Math.max(maxDiameter, 1 + leftLongestPath + 1 + rightLongestPath);
    return Math.max(1 + leftLongestPath, 1 + rightLongestPath);
  }

  public int diameterOfBinaryTree(TreeNode root) {
    maxDiameter = 0;
    diameterOfBinaryTreeRec(root);
    return maxDiameter;
  }

  public static void main(String[] args) {
    final var cls = new DiameterOfBinaryTree();
    assert cls.diameterOfBinaryTree(null) == 0;
    assert cls.diameterOfBinaryTree(new TreeNode()) == 0;
    assert cls.diameterOfBinaryTree(new TreeNode(0, new TreeNode(), null)) == 1;
    assert cls.diameterOfBinaryTree(new TreeNode(0, null, new TreeNode())) == 1;
    assert cls.diameterOfBinaryTree(new TreeNode(0, new TreeNode(), new TreeNode())) == 2;

    assert cls.diameterOfBinaryTree(
      new TreeNode(
        1,
        /*left*/ new TreeNode(
          2,
          /*left*/ new TreeNode(4),
          /*right*/ new TreeNode(5)
        ),
        /*right*/ new TreeNode(3)
      )
    ) == 3;

    assert cls.diameterOfBinaryTree(
      new TreeNode(
        1,
        /*left*/ new TreeNode(
          2,
          /*left*/ new TreeNode(4),
          /*right*/ new TreeNode(
            5,
            /*left*/ null,
            /*right*/ new TreeNode(7)
          )
        ),
        /*right*/ new TreeNode(3)
      )
    ) == 4;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    TreeNode other = (TreeNode) obj;
    if (val != other.val) return false;

    if (left == null) {
      if (other.left != null) return false;
    } else if (!left.equals(other.left)) return false;

    if (right == null) {
      if (other.right != null) return false;
    } else if (!right.equals(other.right)) return false;

    return true;
  }

  @Override
  public String toString() {
    return toString(this, 0);
  }

  private String toString(TreeNode node, int level) {
    if (node == null) return "";
    return toString(node.right, level + 1) +
      "    ".repeat(level) + node.val + "\n" +
      toString(node.left, level + 1);
  }
}

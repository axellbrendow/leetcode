/*-
https://leetcode.com/problems/invert-binary-tree/description/
*/

public class InvertBinaryTree {
  private static TreeNode invertBinaryTree(TreeNode root) {
    if (root == null) return null;
    invertBinaryTree(root.left);
    invertBinaryTree(root.right);
    final var tmp = root.left;
    root.left = root.right;
    root.right = tmp;
    return root;
  }

  public static void main(String[] args) {
    assert invertBinaryTree(null) == null;
    assert invertBinaryTree(new TreeNode()).equals(new TreeNode());
    assert !invertBinaryTree(new TreeNode()).equals(new TreeNode(1));
    assert invertBinaryTree(
      new TreeNode(0, new TreeNode(), null)
    ).equals(
      new TreeNode(0, null, new TreeNode())
    );
    assert invertBinaryTree(
      new TreeNode(0, null, new TreeNode())
    ).equals(
      new TreeNode(0, new TreeNode(), null)
    );
    assert invertBinaryTree(
      new TreeNode(0, new TreeNode(1), new TreeNode(2))
    ).equals(
      new TreeNode(0, new TreeNode(2), new TreeNode(1))
    );
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
}

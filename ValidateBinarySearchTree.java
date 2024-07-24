/*-
https://leetcode.com/problems/validate-binary-search-tree/description/
*/

public class ValidateBinarySearchTree {
  private static boolean isValidBST(TreeNode root, long minValue, long maxValue) {
    if (root == null) return true;
    if (!(minValue < root.val && root.val < maxValue)) return false;
    return isValidBST(root.left, minValue, root.val) && isValidBST(root.right, root.val, maxValue);
  }

  private static boolean isValidBST(TreeNode root) {
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public static void main(String[] args) {
    assert isValidBST(null) == true;
    assert isValidBST(new TreeNode()) == true;
    assert isValidBST(new TreeNode(Integer.MAX_VALUE)) == true;
    assert isValidBST(new TreeNode(Integer.MIN_VALUE)) == true;
    assert isValidBST(new TreeNode(0, new TreeNode(-1), null)) == true;
    assert isValidBST(new TreeNode(0, new TreeNode(1), null)) == false;
    assert isValidBST(new TreeNode(0, null, new TreeNode(-1))) == false;
    assert isValidBST(new TreeNode(0, null, new TreeNode(1))) == true;
    assert isValidBST(new TreeNode(0, new TreeNode(1), new TreeNode(2))) == false;
    assert isValidBST(new TreeNode(0, new TreeNode(-1), new TreeNode(2))) == true;
    assert isValidBST(new TreeNode(0, new TreeNode(-1), new TreeNode(2))) == true;

    assert isValidBST(
      new TreeNode(
        5,
        /*left*/ new TreeNode(
          4,
          /*left*/ null,
          /*right*/ new TreeNode(7)
        ),
        /*right*/ null
      )
    ) == false;
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

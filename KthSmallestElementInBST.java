/*-
https://leetcode.com/problems/kth-smallest-element-in-a-bst/

Constraints:

The number of nodes in the tree is n.
1 <= k <= n <= 10^4
0 <= Node.val <= 10^4
*/

public class KthSmallestElementInBST {
  private int kthSmallest;

  public int kthSmallest(TreeNode root, int k, int smallestChildOrder) {
    if (root == null) return smallestChildOrder;
    int myOrder = kthSmallest(root.left, k, smallestChildOrder);
    if (myOrder == -1) return -1;
    if (myOrder == k) {
      kthSmallest = root.val;
      return -1;
    }
    return kthSmallest(root.right, k, myOrder + 1);
  }

  public int kthSmallest(TreeNode root, int k) {
    kthSmallest = Integer.MAX_VALUE;
    kthSmallest(root, k, 1);
    return kthSmallest;
  }

  public static void main(String[] args) {
    final var solution = new KthSmallestElementInBST();
    assert solution.kthSmallest(
      new TreeNode(
        5,
        /*left*/ new TreeNode(
          3,
          /*left*/ new TreeNode(
            2,
            /*left*/ new TreeNode(1),
            /*right*/ null
          ),
          /*right*/ null
        ),
        /*right*/ null
      ),
      /*k*/ 3
    ) == 3;
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

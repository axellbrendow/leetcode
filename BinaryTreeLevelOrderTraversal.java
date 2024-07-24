import java.util.*;

public class BinaryTreeLevelOrderTraversal {
  public static List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return List.of();
    List<List<Integer>> levels = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int numOfElemsInCurrLevel = queue.size();
      List<Integer> level = new ArrayList<>(numOfElemsInCurrLevel);
      for (int i = 0; i < numOfElemsInCurrLevel; i++) {
        TreeNode node = queue.poll();
        level.add(node.val);
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      levels.add(level);
    }
    return levels;
  }

  public static void main(String[] args) {
    assert levelOrder(null).equals(List.of());
    assert levelOrder(new TreeNode(1)).equals(List.of(List.of(1)));
    assert levelOrder(new TreeNode(1, new TreeNode(-1), new TreeNode(2))).equals(
      List.of(
        List.of(1),
        List.of(-1, 2)
      )
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

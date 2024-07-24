import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/*-
https://leetcode.com/problems/binary-search-tree-iterator/description/

15
7
3

next()
  returns the top of the stack
  go to the right (stacks the node) and then all the way to the left stacking all the nodes
*/

public class BinarySearchTreeIterator {
  private Deque<TreeNode> stack;

  public BinarySearchTreeIterator(TreeNode root) {
    stack = new LinkedList<>();
    pushAllLeftNodes(root);
  }

  private void pushAllLeftNodes(TreeNode root) {
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
  }

  public int next() {
    TreeNode topNode = stack.pop();
    pushAllLeftNodes(topNode.right);
    return topNode.val;
  }

  public boolean hasNext() {
    return !stack.isEmpty();
  }

  public static void main(String[] args) {
    BinarySearchTreeIterator bstIter;

    bstIter = new BinarySearchTreeIterator(null);
    assert bstIter.hasNext() == false;

    bstIter = new BinarySearchTreeIterator(new TreeNode(0));
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 0;

    bstIter = new BinarySearchTreeIterator(new TreeNode(0, new TreeNode(-1), new TreeNode(1)));
    assert bstIter.hasNext() == true;
    assert bstIter.next() == -1;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 0;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 1;
    assert bstIter.hasNext() == false;

    bstIter = new BinarySearchTreeIterator(
      new TreeNode(
        15,
        /*left*/ new TreeNode(
          7,
          /*left*/ new TreeNode(3),
          /*right*/ new TreeNode(10)
        ),
        /*right*/ new TreeNode(
          25,
          /*left*/ new TreeNode(22),
          /*right*/ null
        )
      )
    );
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 3;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 7;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 10;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 15;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 22;
    assert bstIter.hasNext() == true;
    assert bstIter.next() == 25;
    assert bstIter.hasNext() == false;
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

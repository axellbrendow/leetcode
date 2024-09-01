package myjava.shared;

import java.util.*;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode(Iterable<Integer> nums) {
    ListNode prev = null, curr = this;
    for (final var num : nums) {
      curr.val = num;
      curr.next = new ListNode();
      prev = curr;
      curr = curr.next;
    }
    prev.next = null;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + val;
    result = prime * result + ((next == null) ? 0 : next.hashCode());
    return result;
  }

  // @Override
  // public boolean equals(Object obj) {
  //   if (this == obj) return true;
  //   if (obj == null) return false;
  //   if (getClass() != obj.getClass()) return false;
  //   ListNode other = (ListNode) obj;
  //   if (val != other.val) return false;
  //   if (next == null) {
  //     if (other.next != null) return false;
  //   } else if (!next.equals(other.next)) return false;
  //   return true;
  // }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    return toString().equals(obj.toString());
  }

  @Override
  public String toString() {
    Set<ListNode> set = new HashSet<>();
    ListNode node = this;
    String str = "";
    while (node != null) {
      if (set.contains(node)) return str + String.format("[circular -> %d]", node.val);
      set.add(node);
      str += node.val + " -> ";
      node = node.next;
    }
    str += "null";
    return str;
  }
}

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
      if (set.contains(node)) return str + "[circular]";
      set.add(node);
      str += node.val + " -> ";
      node = node.next;
    }
    str += "null";
    return str;
  }
}

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNodeFromEndOfListV2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // This queue will store the n + 1 last nodes in the list.
        // This way I can remove the nth last node.
        final Queue<ListNode> queue = new LinkedList<>();

        var node = head;
        while (node != null) {
            queue.offer(node);
            if (queue.size() > n + 1) {
                queue.poll();
            }
            node = node.next;
        }

        if (queue.size() == n + 1) {
            queue.peek().next = queue.peek().next.next;
        } else {
            head = head.next;
        }

        return head;
    }
}
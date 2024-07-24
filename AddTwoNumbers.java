class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reminder = 0;
        int carry = 0;
        final var output = new ListNode();
        var currOutputNode = output;

        while (l1 != null && l2 != null) {
            reminder = (carry + l1.val + l2.val) % 10;
            carry = (carry + l1.val + l2.val) / 10;
            l1 = l1.next;
            l2 = l2.next;
            currOutputNode.next = new ListNode(reminder);
            currOutputNode = currOutputNode.next;
        }

        while (l1 != null) {
            reminder = (carry + l1.val) % 10;
            carry = (carry + l1.val) / 10;
            l1 = l1.next;
            currOutputNode.next = new ListNode(reminder);
            currOutputNode = currOutputNode.next;
        }

        while (l2 != null) {
            reminder = (carry + l2.val) % 10;
            carry = (carry + l2.val) / 10;
            l2 = l2.next;
            currOutputNode.next = new ListNode(reminder);
            currOutputNode = currOutputNode.next;
        }

        if (carry > 0) {
            currOutputNode.next = new ListNode(carry);
        }

        return output.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        var testNumber = 0;

        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        var expectedOutput = new ListNode(7, new ListNode(0, new ListNode(8)));
        var output = solution.addTwoNumbers(l1, l2);
        var testPassed = expectedOutput.equals(output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        l1 = new ListNode(2, new ListNode(4));
        l2 = new ListNode(9, new ListNode(5));
        expectedOutput = new ListNode(1, new ListNode(0, new ListNode(1)));
        output = solution.addTwoNumbers(l1, l2);
        testPassed = expectedOutput.equals(output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode))
            return false;

        ListNode l1 = this, l2 = (ListNode) obj;

        while (l1 != null && l2 != null && l1.val == l2.val) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1 == null && l2 == null;
    }
}

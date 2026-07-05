class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;

        List<Integer> ans = new ArrayList<>();
        int carry = 0;

        while (n1 != null || n2 != null) {
            int x = (n1 != null) ? n1.val : 0;
            int y = (n2 != null) ? n2.val : 0;

            int sum = x + y + carry;
            ans.add(sum % 10);
            carry = sum / 10;

            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }

        if (carry > 0) {
            ans.add(carry);
        }

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        for (int i = 0; i < ans.size(); i++) {
            node.next = new ListNode(ans.get(i));
            node = node.next;
        }

        return dummy.next;
    }

    // private ListNode reverse(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;

    //     while (curr != null) {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     return prev;
    // }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode dummy = new ListNode();
        ListNode node = dummy;
        while(n1!=null || n2!=null){
            int x = (n1!=null)? n1.val:0;
            int y = (n2!=null)? n2.val:0;
            int sum = x+y+carry;
            int digit = sum%10;
            carry = sum/10;
            node.next= new ListNode(digit);
            node = node.next;
            if(n1!=null) n1 = n1.next;
            if(n2!=null) n2 = n2.next;
        }
        if(carry>0){
            node.next = new ListNode(carry);
           // node = node.next;
        }
        
        return dummy.next;
    }
}

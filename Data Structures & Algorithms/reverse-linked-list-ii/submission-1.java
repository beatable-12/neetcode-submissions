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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode currNode = head;
        ListNode leftpre = dummy;
        for(int i =0;i<left-1;i++){
            leftpre = leftpre.next;
            currNode = currNode.next;
        }
        ListNode sublistHead = currNode;
        ListNode prevNode = null;
        for(int i = 0;i<=right-left;i++){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode=nextNode;
        }
        leftpre.next = prevNode;
        sublistHead.next = currNode;
        return dummy.next;
    }
}
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
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int n =1;
        while(temp!=null){
            if(n>=left && n<=right){
                st.push(temp.val);
            }
            n++;
            temp = temp.next;
        }
        temp = head;
        n=1;
        while(temp!=null){
            if(n>=left && n<=right){
                temp.val=st.pop();
            }
            n++;
            temp = temp.next;
        }
        return head;
    }
}
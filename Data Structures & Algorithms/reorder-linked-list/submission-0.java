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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp =head;
        int half = n/2;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt>=half) st.push(temp);
            temp = temp.next;
        }
        temp=head;
        for(int i =0;i<n/2;i++){
            ListNode rm = st.pop();
            rm.next=temp.next;
            temp.next = rm;
            temp = rm.next;
        }
        temp.next = null;
    }
}

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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ls = new ArrayList<>();
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        int n = lists.length;
        if(n == 0) return null;
        for(int i = 0;i<n;i++){
           ListNode temp = lists[i];
           while(temp!=null){
            ls.add(temp.val);
            temp = temp.next;
           }
        }
        Collections.sort(ls);
        for(int i:ls){
            ListNode newNode = new ListNode(i);
            node.next = newNode;
            node = node.next;
        }
        return dummy.next;
    }
}
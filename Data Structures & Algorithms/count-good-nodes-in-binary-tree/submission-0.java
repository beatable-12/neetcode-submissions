/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int goodNodes(TreeNode root) {
         return count(root,root.val);
          //cnt;
    }
    public int count(TreeNode root,int max){
        if(root == null){
            return 0;
        }
        int cnt = 0;
        if(max<=root.val){
            cnt = 1;
        }
        max = Math.max(max,root.val);
        cnt+=count(root.left,max);
        cnt+=count(root.right,max);
        return cnt;
    }
}
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return add(root,val);        
    }
    public TreeNode add(TreeNode root,int val){
        if(root == null){
            return new TreeNode(val);
        }
        
        if(root.val<=val){
            root.right= add(root.right,val);
        }
        if(root.val>val){
            root.left =  add(root.left,val);
        }
        return root;
        

        // if(root.val<=val){
        //     root.right = new TreeNode(val);
        // }else{
        //     root.left = new TreeNode(val);
        // }
    }
}
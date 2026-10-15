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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
    int idx =0;
    private TreeNode build(int[] pre,int[] in,int start,int end){
        if(start>end){
            return null;
        }
       
        TreeNode root = new TreeNode(pre[idx]);
        int mid = start;
        while(in[mid]!=root.val){
            mid++;
        }
        idx++;
        root.left = build(pre,in,start,mid-1);
        root.right = build(pre,in,mid+1,end);

        return root;
    }
}
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
    //int sum=0;
    //int ml=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return Math.max(lh,rh)+1;
    }
    public int solve(TreeNode root,int c,int res){
        //int res=maxDepth(root);
        if(root==null) return 0;
        if(c==res) return root.val;
        int l=solve(root.left,c+1,res);
        int r=solve(root.right,c+1,res);
        return l+r;
        
    }
    public int deepestLeavesSum(TreeNode root) {
        int m=maxDepth(root);
        int sum=solve(root,1,m);
        return sum;
    }
}
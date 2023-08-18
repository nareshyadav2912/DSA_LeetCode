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
    
    int globalCount = 0;
    // public void in(TreeNode root){
    //     if(root==null) return;
    //     in(root.left);
    //     sum=sum+root.val;
    //     count++;
    //     in(root.right);
    // }

    public int findSum(TreeNode root){
        if(root==null) return 0;
        return root.val+findSum(root.left)+findSum(root.right);
    }

    public int countNodes(TreeNode root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public void preOrder(TreeNode root){
        if(root==null) return;
        int sum = findSum(root);
        int nodes = countNodes(root);
        int avg = sum/nodes;
        if(avg==root.val) globalCount++;
        preOrder(root.left);
        preOrder(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        preOrder(root);

        return globalCount;
    }
}
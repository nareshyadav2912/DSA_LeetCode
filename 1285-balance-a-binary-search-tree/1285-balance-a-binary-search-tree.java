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
    ArrayList<Integer> al=new ArrayList<>();
    public void in(TreeNode root){
        if(root==null) return;
        in(root.left);
        al.add(root.val);
        in(root.right);
    }
    public TreeNode con(List<Integer> al,int s,int e){
        if(s>e) return null;
        int m=(s+e)/2;
        TreeNode root=new TreeNode(al.get(m));
        root.left=con(al,s,m-1);
        root.right=con(al,m+1,e);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        in(root);
        TreeNode ans=con(al,0,al.size()-1);
        System.out.println(al);
        return ans;
    }
}
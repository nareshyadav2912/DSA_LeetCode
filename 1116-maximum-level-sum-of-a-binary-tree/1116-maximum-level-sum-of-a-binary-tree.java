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
    int ans=Integer.MIN_VALUE;
    Map<Integer,Integer> hm=new HashMap<>();
    public int level(TreeNode root){
        int level=0;
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            level++;
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                TreeNode curr=q.poll();
                sum=sum+curr.val;
                hm.put(level,sum);
            }
            //level++;
            ans=Math.max(ans,sum);
        }
        int i=0;
        for(Integer x:hm.keySet()){
            if(hm.get(x)==ans) {
                i=x;
                break;
            }
        }
        return i;
    }
    public int maxLevelSum(TreeNode root) {
        int a=level(root);
        return a;
    }
}
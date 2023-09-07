class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int num,int n,int k,List<Integer> ds){
        if(k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=num;i<=n-k+1;i++){
            ds.add(i);
            helper(i+1,n,k-1,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        helper(1,n,k,new ArrayList<>());
        return ans;
    }
}
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int num,int n,int k,List<Integer> ds){
        if(num>n){
            if(k==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(num);
        helper(num+1,n,k-1,ds);
        ds.remove(ds.size()-1);
        helper(num+1,n,k,ds);
    }
    public List<List<Integer>> combine(int n, int k) {
        helper(1,n,k,new ArrayList<>());
        return ans;
    }
}
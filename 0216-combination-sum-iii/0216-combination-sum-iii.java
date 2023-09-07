class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int num,int k,int target,List<Integer> ds){
        if(ds.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
        }
        for(int i=num;i<=9;i++){
            ds.add(i);
            helper(i+1,k,target-i,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(1,k,n,new ArrayList<>());
        return ans;
    }
}
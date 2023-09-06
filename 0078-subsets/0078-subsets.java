class Solution {
    // public void subset(int[] nums,int ind,List<Integer> al,List<List<Integer>> ans){
    //     ans.add(new ArrayList<>(al));
    //     for(int i=ind;i<nums.length;i++){
    //         al.add(nums[i]);
    //         subset(nums,i+1,al,ans);
    //         al.remove(al.size()-1);
    //     }
    // }
    List<List<Integer>> ans=new ArrayList<>();
    public void gen(int[] nums,int ind,List<Integer> ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        gen(nums,ind+1,ds);
        ds.remove(ds.size()-1);
        gen(nums,ind+1,ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        //List<List<Integer>> ans=new ArrayList<>();
        gen(nums,0,new ArrayList<>());
        return ans;
    }
}
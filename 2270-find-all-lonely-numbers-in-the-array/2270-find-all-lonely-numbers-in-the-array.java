class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //temp.add(nums[i]);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        //System.out.println(hm);
        for(int i:hm.keySet()){
            if(hm.get(i)==1 && (!hm.containsKey(i+1)) && (!hm.containsKey(i-1))){
                ans.add(i);
            }
        }
        return ans;
    }
}
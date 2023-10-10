class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],0);
            }
        }
        int sum=0;
        for(int i:hm.keySet()){
            if(hm.get(i)==0){
                sum=sum+i;
            }
        }
        System.out.println(hm);
        return sum;
    }
}
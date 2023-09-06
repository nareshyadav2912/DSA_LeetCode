class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            String curr=nums[i];
            for(int j=0;j<nums.length;j++){
                String ans=curr+nums[j];
                System.out.print(ans+" ");
                if(ans.equals(target) && (i!=j)){
                    c++;
                }
            }
        }
        return c;
    }
}
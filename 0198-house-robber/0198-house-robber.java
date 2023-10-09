class Solution {
    public int helper(int ind,int[] nums,int[] dp){
        Arrays.fill(dp,-1);
        if(ind<0) return 0;
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[ind];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        int ans=helper(nums.length-1,nums,dp);
        return ans;
    }
}
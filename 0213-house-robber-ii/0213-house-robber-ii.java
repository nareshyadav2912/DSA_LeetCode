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
        int a1[]=new int[nums.length];
        int a2[]=new int[nums.length];
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(i!=0) a1[i]=nums[i];
            if(i!=nums.length-1) a2[i]=nums[i];
        }
        int ans1=helper(nums.length-1,a1,dp);
        int ans2=helper(nums.length-1,a2,dp);
        return Math.max(ans1,ans2);
    }
}
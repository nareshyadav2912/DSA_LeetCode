class Solution {
    public int helper(int ind,int[] cost,int[] dp){
        if(ind<0) return 0;
        if(ind==0 || ind==1) return cost[ind];
        if(dp[ind]!=0) return dp[ind];
        dp[ind]=cost[ind]+Math.min(helper(ind-1,cost,dp),helper(ind-2,cost,dp));
        return dp[ind];
    }
    public int minCostClimbingStairs(int[] cost) {
        int ind=cost.length;
        int dp[]=new int[ind];
        return Math.min(helper(ind-1,cost,dp),helper(ind-2,cost,dp));
    }
}
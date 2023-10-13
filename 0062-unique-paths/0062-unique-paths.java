class Solution {
    public int helper(int i,int j,int[][] dp){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0 ) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=helper(i-1,j,dp) + helper(i,j-1,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        int ans=helper(m-1,n-1,dp);
        return ans;
    }
}
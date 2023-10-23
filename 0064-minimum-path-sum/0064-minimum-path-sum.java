class Solution {
    public int fun(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int up=Integer.MAX_VALUE;
        int le=Integer.MAX_VALUE;
        if(i>0) up=grid[i][j] + fun(i-1,j,grid,dp);
        if(j>0) le=grid[i][j] + fun(i,j-1,grid,dp);
        return dp[i][j]=Math.min(up,le);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        return fun(m-1,n-1,grid,dp);
    }
}
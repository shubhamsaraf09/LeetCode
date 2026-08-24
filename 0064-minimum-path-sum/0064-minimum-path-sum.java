class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
       for(int[] i : dp) Arrays.fill(i,-1);
        return f(grid.length-1,grid[0].length-1,grid);
    }
    int f(int i,int j,int[][] grid){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return 40000;
        if(dp[i][j]!=-1) return dp[i][j];

        int up=grid[i][j] + f(i-1,j,grid);
        int left=grid[i][j] + f(i,j-1,grid);

        return dp[i][j]=Math.min(up,left);
    }
}
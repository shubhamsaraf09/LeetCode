class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return grid(dp,grid,grid.length-1,grid[0].length-1);
    }
    int grid(int[][] dp,int[][] grid, int m,int n){
        if(m==0 && n==0) return grid[m][n];
        if(m<0 || n<0) return 40000;
        if(dp[m][n]!=-1) return dp[m][n];

        int left=grid[m][n]+grid(dp,grid,m,n-1);
        int up=grid[m][n]+grid(dp,grid,m-1,n);

        return dp[m][n] = Math.min(left,up);
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        // for(int[] row : dp){
        //     Arrays.fill(row,-1);
        // }
        return grid(dp,grid,grid.length-1,grid[0].length-1);
    }
    int grid(int[][] dp,int[][] grid, int m,int n){
        // if(m==0 && n==0) return grid[m][n];
        // if(m<0 || n<0) return 40000;
        // if(dp[m][n]!=-1) return dp[m][n];

        // int left=grid[m][n]+grid(dp,grid,m,n-1);
        // int up=grid[m][n]+grid(dp,grid,m-1,n);

        // return dp[m][n] = Math.min(left,up);
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0) dp[i][j]=grid[i][j];
                else{
                    int left=0,right=0;
                    if(j==0) left=40000;
                    else left=grid[i][j]+dp[i][j-1];
                    if(i==0) right=40000;
                    else right=grid[i][j]+dp[i-1][j];
                    dp[i][j]=Math.min(left,right);
                }

            }
        }
        return dp[m][n];
    }
}
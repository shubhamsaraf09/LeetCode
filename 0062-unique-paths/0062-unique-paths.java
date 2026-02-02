class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[m][n];  
        return grid(grid,m-1,n-1);
    }
    int grid(int[][] grid,int m,int n){
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                int up=0,left=0;
                if(i==0 && j==0) grid[i][j]=1;
                else {
                    if(i>0) up=grid[i-1][j];
                    if(j>0) left=grid[i][j-1];
                    grid[i][j]=up+left;
                }
            }
        }
        return grid[m][n];
    }
}
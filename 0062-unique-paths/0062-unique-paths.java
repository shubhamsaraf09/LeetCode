class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[m][n];  
        for (int[] row : grid) {
    Arrays.fill(row, -1);
}
        return grid(grid,m-1,n-1);
    }
    int grid(int[][] grid,int m,int n){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(grid[m][n]!=-1) return grid[m][n];
         int right=grid(grid,m,n-1);
         int down=grid(grid,m-1,n);
         return grid[m][n]=right+down;
    }
}
class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][] dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return f(0,0,grid[0].length-1,grid,dp);
    }
    int f(int i,int j1,int j2,int[][] grid,int[][][] dp){
        int n=grid[0].length-1;
        int max=Integer.MIN_VALUE;
        if(j1>n || j1<0 || j2<0 || j2>n) return -100000000;
        if(i==grid.length-1){
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }  
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int[] arr={-1,0,1};
        for(int l : arr){
            for(int r : arr){
                int value=0;
                if(j1==j2) value=grid[i][j1]+f(i+1,j1+l,j2+r,grid,dp);
                else value=grid[i][j1]+grid[i][j2]+f(i+1,j1+l,j2+r,grid,dp);
                max=Math.max(value,max);
                
            }
        }
        return dp[i][j1][j2]=max;
    }
}
class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int[][] dp=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                 if(arr[i][j]==1) continue;
                if(i==0 && j==0) {
                    dp[i][j]=1;
                    continue;
                }
               
                int up=0;
                if(i>0) up=dp[i-1][j];
                int left=0;
                if(j>0) left=dp[i][j-1];

                dp[i][j]=up+left;
            }
        }

        return dp[arr.length-1][arr[0].length-1];
        
    }
    // int f(int i,int j,int[][] grid){
    //     if(i<0 || j < 0 || grid[i][j]==1) return 0;
    //     if(i==0 && j==0) return 1;
        

    //     int up=f(i-1,j,grid);
    //     int left=f(i,j-1,grid);

    //     return up+left;
    // }    
}
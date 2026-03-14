class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int s=matrix[i][j]+dp[i-1][j];
                int ld=matrix[i][j]+(j>0? dp[i-1][j-1] : 100000000);
                int rd=matrix[i][j]+(j<n-1? dp[i-1][j+1] : 100000000);
                dp[i][j]=Math.min(s,Math.min(ld,rd));
            }
        }
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}
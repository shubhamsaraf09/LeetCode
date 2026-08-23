class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(f(cost,0,dp),f(cost,1,dp));
    }
    int f(int[] arr, int i,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one = f(arr,i+1,dp);
        int two = f(arr,i+2,dp);

        return dp[i]=arr[i] + Math.min(one,two);
    }
}
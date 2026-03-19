class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        } 
        return f(coins.length-1,amount,coins,dp);
    }
    int f(int n,int target,int[] arr,int[][] dp){
        if(n==0){
            if(target%arr[0]==0) return 1;
            return 0;
        }
        if(dp[n][target]!=-1) return dp[n][target];
        int nottake=f(n-1,target,arr,dp);
        int take=0;
        if(arr[n]<=target) take=f(n,target-arr[n],arr,dp);
        return dp[n][target]=take+nottake;
    }
}
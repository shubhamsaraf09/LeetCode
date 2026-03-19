class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        int ans=f(coins.length-1,amount,coins,dp);
        return ans>=1000000000 ? -1 : ans;
    }
    // int f(int n,int amount,int[] arr,int[][] dp){
    //     if(n==0){
    //         if(amount%arr[0]==0) return amount/arr[0];
    //         else return 1000000000;
    //     }
    //     if(dp[n][amount]!=-1) return dp[n][amount];
    //     int nottake=f(n-1,amount,arr,dp);
    //     int take =Integer.MAX_VALUE;
    //     if(arr[n]<=amount) take=1+f(n,amount-arr[n],arr,dp);
    //     return dp[n][amount]=Math.min(take,nottake);
    // }
    int f(int n,int amount,int[] arr,int[][] dp){
        for(int i=0;i<=amount;i++){
            if(i%arr[0]==0) dp[0][i]=i/arr[0];
            else dp[0][i]=1000000000;
        }
            
        for(int i=1;i<arr.length;i++){
            for(int l=0;l<=amount;l++){
                int nottake=dp[i-1][l];
                int take =Integer.MAX_VALUE;
                if(arr[i]<=l) take=1+dp[i][l-arr[i]];
                 dp[i][l]=Math.min(take,nottake);
            }
        }
        return dp[n][amount];
    }
}
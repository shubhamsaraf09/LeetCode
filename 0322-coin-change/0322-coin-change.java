class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int ans=f(coins.length-1,amount,coins);
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
    int f(int n,int amount,int[] arr){
        int[] prev=new int[amount+1];
        
        for(int i=0;i<=amount;i++){
            if(i%arr[0]==0) prev[i]=i/arr[0];
            else prev[i]=1000000000;
        }
            
        for(int i=1;i<arr.length;i++){
            int[] cur=new int[amount+1];
            for(int l=0;l<=amount;l++){
                int nottake=prev[l];
                int take =Integer.MAX_VALUE;
                if(arr[i]<=l) take=1+cur[l-arr[i]];
                 cur[l]=Math.min(take,nottake);
            }
            prev=cur;
        }
        return prev[amount];
    }
}
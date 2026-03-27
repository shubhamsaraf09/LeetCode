class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length+1][2];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(0,prices,1,dp);
    }
    // int f(int[] prices){
    //     int[][] dp=new int[prices.length+1][2];
    //     for(int ind=prices.length-1;ind>=0;ind++){
    //         for(int j=0;j<=1;j++){
    //             int profit=0;
    //             if(j==1) {
    //                 profit=Math.max(-prices[ind]+dp[ind+1][0],dp[ind+1][1]);
    //             }
    //             else profit=Math.max(prices[ind]+dp[ind+2][1],dp[ind+1][0]);
    //             dp[ind][j]=profit;
    //         }
    //     }
    //     return dp[0][0];
    // }
    int f(int ind,int[] prices,int buy,int[][] dp){
        if(ind>=prices.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+f(ind+1,prices,0,dp),f(ind+1,prices,1,dp));
        }
        else {
            profit=Math.max(prices[ind]+f(ind+2,prices,1,dp),f(ind+1,prices,0,dp));
        }
        return dp[ind][buy]=profit;
    }

}
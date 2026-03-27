class Solution {
    public int maxProfit(int[] prices, int fee) {
    //     int[][] dp=new int[prices.length][2];
    //     for(int[] i : dp){
    //         Arrays.fill(i,-1);
    //     }
    //     return f(0,1,prices,fee,dp);
    return f(prices,fee);
    }
    // }
    // int f(int ind,int buy,int[] prices,int fee,int[][] dp){
    //     if(ind==prices.length) return 0;
    //     if(dp[ind][buy]!=-1) return dp[ind][buy];
    //     int profit=0;
    //     if(buy==1){
    //         profit=Math.max(-prices[ind]+f(ind+1,0,prices,fee,dp),f(ind+1,1,prices,fee,dp));
    //     }
    //     else profit=Math.max(prices[ind]-fee+f(ind+1,1,prices,fee,dp),f(ind+1,0,prices,fee,dp));
    //     return dp[ind][buy]=profit;
    // }
    int f(int[] prices,int fee){
        int[][] dp=new int[prices.length+1][2];
        for(int[] i : dp){
            Arrays.fill(i,0);
        }
        for(int ind=prices.length-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                int profit=0;
                if(buy==1){
                    profit=Math.max(-prices[ind]+dp[ind+1][0],dp[ind+1][1]);
                }
                else{
                    profit=Math.max(prices[ind]-fee+dp[ind+1][1],dp[ind+1][0]);
                }
                dp[ind][buy]=profit;
            }
        }
        return dp[0][1];
    }
}
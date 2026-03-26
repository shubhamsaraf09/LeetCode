class Solution {
    public int maxProfit(int[] prices) {
//         int[][][] dp = new int[prices.length][2][2];

// for (int i = 0; i < prices.length; i++) {
//     for (int j = 0; j < 2; j++) {
//         Arrays.fill(dp[i][j], -1);
//     }
// }
        // return f(0,1,prices,1,dp);
        return f(prices);
    }
//     int f(int ind,int buy,int[] prices,int cap,int[][][] dp){
//         if(ind==prices.length) return 0;
//         if(cap<0) return 0;
//         if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
//         int profit=0;
//         if(buy==1){
//             profit=Math.max(-prices[ind]+f(ind+1,0,prices,cap,dp),f(ind+1,1,prices,cap,dp));
//         }
//         else profit=Math.max(prices[ind]+f(ind+1,1,prices,cap-1,dp),f(ind+1,0,prices,cap,dp));
    
//     return dp[ind][buy][cap]=profit;
// }

        int f(int[] prices){
        // if(ind==prices.length) return 0;
        // if(cap<0) return 0;
        int n=prices.length;
        int[][][] dp=new int[n+1][2][3];
        for(int ind=0;ind<=n;ind++){
            dp[ind][0][0]=0;
            dp[ind][1][0]=0;
        }
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                dp[n][i][j]=0;
            }
        }
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<=2;cap++){
                    int profit=0;
                    if(buy==1){
                        profit=Math.max(-prices[ind]+dp[ind+1][0][cap],dp[ind+1][1][cap]);
                    }
                    else profit=Math.max(prices[ind]+dp[ind+1][1][cap-1],dp[ind+1][0][cap]);
                 dp[ind][buy][cap]=profit;
                }
            }
        }
      
    return dp[0][1][2];
}

}
class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][2];

for (int i = 0; i < prices.length; i++) {
    for (int j = 0; j < 2; j++) {
        Arrays.fill(dp[i][j], -1);
    }
}
        return f(0,1,prices,1,dp);
    }
    int f(int ind,int buy,int[] prices,int cap,int[][][] dp){
        if(ind==prices.length) return 0;
        if(cap<0) return 0;
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+f(ind+1,0,prices,cap,dp),f(ind+1,1,prices,cap,dp));
        }
        else profit=Math.max(prices[ind]+f(ind+1,1,prices,cap-1,dp),f(ind+1,0,prices,cap,dp));
    
    return dp[ind][buy][cap]=profit;
}
}
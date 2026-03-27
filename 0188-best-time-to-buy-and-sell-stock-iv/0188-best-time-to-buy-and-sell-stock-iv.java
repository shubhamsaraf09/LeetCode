class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] dp=new int[prices.length][2*k+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        } 
        return f(0,prices,0,2*k,dp);
    }
    int f(int ind,int[] prices,int trans,int k,int[][] dp){
        if(ind==prices.length || trans==k) return 0;
        if(dp[ind][trans]!=-1) return dp[ind][trans];
        int profit=0;
        if(trans%2==0){
            profit=Math.max(-prices[ind]+f(ind+1,prices,trans+1,k,dp),f(ind+1,prices,trans,k,dp));
        } 
        else{
            profit=Math.max(prices[ind]+f(ind+1,prices,trans+1,k,dp),f(ind+1,prices,trans,k,dp));
        }
        return dp[ind][trans]=profit;
    }
}
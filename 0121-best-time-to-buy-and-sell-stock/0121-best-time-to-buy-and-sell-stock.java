class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int cost=-1000000;
        for(int i : prices){
            cost=Math.max(cost,i-min);
            min=Math.min(min,i);
        }
        return cost;
    }
}
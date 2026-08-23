class Solution {
    int[] dp;
    public int rob(int[] arr) {
        dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        return helper(arr,arr.length-1);
    }
    int helper(int[] arr,int i){
        if(i==0) return arr[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + helper(arr,i-2);
        int notpick = helper(arr,i-1);

        return dp[i]=Math.max(pick,notpick); 
    }
}
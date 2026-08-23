class Solution {
    int[] dp;
    public int rob(int[] arr) {
        dp=new int[arr.length+1];
        dp[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            int take = arr[i];
            if(i>1) take+=dp[i-2];
            int nottake=dp[i-1];

            dp[i]=Math.max(take, nottake);
        }
        return dp[arr.length-1];
    }
}
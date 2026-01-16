class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        return help(nums,nums.length-1,dp);
    }
    int help(int[] arr,int ind,int[] dp){
        dp[0]=arr[0];
        for(int i=1;i<=ind;i++){
        
        int pick=arr[i];
        if(i>1) pick+=dp[i-2];
        int notpick=dp[i-1];
        dp[i]=Math.max(pick,notpick);
        }
        return dp[ind];
    }
}
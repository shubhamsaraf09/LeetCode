class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return help(nums,nums.length-1,dp);
    }
    int help(int[] arr,int ind,int[] dp){
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick=arr[ind]+help(arr,ind-2,dp);
        int notpick=help(arr,ind-1,dp);

        return dp[ind]=Math.max(pick,notpick);
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        if(Math.abs(target)>sum) return 0;
        if((sum+target)%2!=0) return 0;
        int[][] dp=new int[nums.length][(sum+target)/2+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(nums.length-1,(sum+target)/2,nums,dp);
    }
    int f(int n,int target,int[] arr,int[][] dp){
        if(n==0){
            if(target==0 && arr[0]==0) return 2;
            if(arr[0]==target || target==0) return 1; 
            
            return 0;
        }
        if(dp[n][target]!=-1) return dp[n][target];
        int nottake=f(n-1,target,arr,dp);
        int take=0;
        if(arr[n]<=target) take=f(n-1,target-arr[n],arr,dp);
        return dp[n][target]=take+nottake;
    }
}
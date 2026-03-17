class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int[][] dp=new int[nums.length][sum/2+1];
        for(int[] ar: dp){
            Arrays.fill(ar,-1);
        }
        if(sum%2==0 ) return f(nums.length-1,sum/2,nums,dp);
        else return false;
    }
    boolean f(int n,int target,int[] arr,int[][] dp){
        if(n==0) return arr[0]==target;
        if(target==0) return true;
        //if(arr[n]>target) return false;
        if(dp[n][target]!=-1) return dp[n][target]==1;
        boolean nottake=f(n-1,target,arr,dp);
        boolean take=false;
        if(arr[n]<=target){
            take=f(n-1,target-arr[n],arr,dp);
        }
        dp[n][target]=0;
        if(take || nottake) dp[n][target]=1;
        return dp[n][target]==1;
    }
}

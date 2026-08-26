class Solution {
    int[][] dp;
    
    public boolean canPartition(int[] nums) {
         int sum=0;
        for(int i : nums){
            sum+=i;
        }
        if(sum%2!=0) return false;

        dp=new int[nums.length][sum/2+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

       
        return f(nums.length-1,sum/2,nums);
    }

    boolean f(int i,int target,int[] arr){
        if(target==0) return true;
        if(i==0) return arr[0]==target;

        if(dp[i][target]!=-1) return dp[i][target] == -1;

        boolean notpick=f(i-1,target,arr);
        boolean pick=false;
        if(arr[i]<=target) pick=f(i-1,target-arr[i],arr);

        int val=0;
        if(pick || notpick) val=1;

        dp[i][target]=val;
        return val==1;
    }

}
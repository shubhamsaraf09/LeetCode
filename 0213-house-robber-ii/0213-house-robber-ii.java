class Solution {
    public int rob(int[] nums) {
        int[] temp1=new int[nums.length-1];
        int[] temp2=new int[nums.length-1];
        int[] dp=new int[temp1.length];
        if(nums.length==1) return nums[0];
        Arrays.fill(dp,-1);
        int[] dp1=new int[temp1.length];
        Arrays.fill(dp1,-1);
        for(int i=0;i<nums.length-1;i++){
           temp1[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
           temp2[i-1]=nums[i];
        }
        return Math.max(help(temp1,temp1.length-1,dp1),help(temp2,temp1.length-1,dp));
    }
    int help(int[] arr,int ind,int[] dp){
        if(ind==0) return arr[0];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int left=arr[ind]+help(arr,ind-2,dp);
        int right=help(arr,ind-1,dp);
        return dp[ind]=Math.max(left,right);
    }
}
class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxval=0;
        for(int i=0;i<nums.length;i++){
            maxval=Math.max(nums[i],maxval);
        }
        int[] points=new int[maxval+1];
        for(int num : nums){
            points[num]+=num;
        }
        int[] dp=new int[maxval+1];
        dp[0]=0;
        dp[1]=points[1];
        for(int i=2;i<points.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+points[i]);
        }
        return dp[maxval];
    }
}
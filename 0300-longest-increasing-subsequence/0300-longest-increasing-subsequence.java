class Solution {
    public int lengthOfLIS(int[] nums) {
        // int[][] dp=new int[nums.length][nums.length];
        // for(int[] i : dp){
        //     Arrays.fill(i,-1);
        // }
        int[][] dp=new int[nums.length][nums.length+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(0,-1,nums,dp);
    }
    // int f(int ind,int prev,int[] nums,int[][] dp){
    //     if(ind==nums.length) return 0;
    //     if(prev!=-1 && dp[ind][prev]!=-1) return dp[ind][prev];
    //     int nottake=f(ind+1,prev,nums,dp);
    //     int take=0;
    //     if(prev==-1 || nums[ind]>nums[prev]){
    //         take=1+f(ind+1,ind,nums,dp);
    //     }
    //     if(prev!=-1) return dp[ind][prev]=Math.max(take,nottake);
    //     return Math.max(take,nottake);
    // }

    int f(int ind,int prev,int[] nums,int[][] dp){
        if(ind==nums.length) return 0;
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
        int nottake=f(ind+1,prev,nums,dp);
        int take=0;
        if(prev==-1 || nums[ind]>nums[prev]){
            take=1+f(ind+1,ind,nums,dp);
        }
        return dp[ind][prev+1]=Math.max(take,nottake);
    }
}
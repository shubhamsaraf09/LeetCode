class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[][] dp=new int[nums.length][target+1]; 
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(target, 0, nums,dp);
    }

    int f(int target, int i, int[] arr,int[][] dp) {

        // target achieved
        if (target == 0) return 1;

        // all choices tried
        if (i == arr.length) return 0;
        if(dp[i][target]!=-1) return dp[i][target];
        int take = 0;

        // pick current element → restart choices
        if (arr[i] <= target) {
            take = f(target - arr[i], 0, arr,dp); // 🔥 reset
        }

        // move to next choice
        int notTake = f(target, i + 1, arr,dp);

        return dp[i][target]=take + notTake;
    }
}
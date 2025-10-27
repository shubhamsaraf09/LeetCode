class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);        
    }
    int helper(int[] nums,int goal){
        if(goal<0) return 0;
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r];
            
            while(sum>goal) {
                sum-=nums[l++];
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}
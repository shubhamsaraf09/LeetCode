class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
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
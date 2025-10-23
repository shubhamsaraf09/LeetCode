class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l=0,r=0,count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==goal) count++;
            sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal) count++;
            }
        }
        return count;
    }
}
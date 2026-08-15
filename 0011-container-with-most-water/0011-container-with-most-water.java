class Solution {
    public int maxArea(int[] nums) {
        
        int max=0;
        int len=0;

        int i=0;int j=nums.length-1;
        while(i<j){
            if(nums[i]>nums[j]){
                len=Math.min(nums[i],nums[j])*(j-i);
                j--;
            }
            else{
                len=Math.min(nums[i],nums[j])*(j-i);
                i++;
            }
            max=Math.max(len,max);
        }
            return max;
    }
}
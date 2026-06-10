class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i+1]-nums[i]);
        }
        return max;
    }
}
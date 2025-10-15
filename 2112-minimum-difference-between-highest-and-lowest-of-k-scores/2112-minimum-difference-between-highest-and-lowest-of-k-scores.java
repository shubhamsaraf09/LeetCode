class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE,dif=0;
        int l=0;
        int r=k-1;
    

        while(r<nums.length){
            dif=nums[r]-nums[l];
            min=Math.min(min,dif);
            l++;
            r++;    
        }
        return min;
    }
}
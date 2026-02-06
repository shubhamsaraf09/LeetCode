class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int max=0;
        int j=nums.length-1;
        for(int r=0;r<=j;r++){
            while(nums[r]>(long)k*nums[i]){
               
                    i++;
                    
            }
                max=Math.max(max,r-i+1);
            
        }
        return j+1-max;
    }
}
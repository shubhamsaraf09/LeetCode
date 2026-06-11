class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int k=nums.length;
        while(i<nums.length && j<nums.length){
            while(j<nums.length && nums[i]==nums[j]){
                if((j-i)>=2) {
                    nums[j]=Integer.MAX_VALUE;
                    count++;
                }
                j++;
            }
            if(j<nums.length && nums[i]!=nums[j]){
                i=j;
            }

        }
        Arrays.sort(nums);
        return k-count;
    }
}
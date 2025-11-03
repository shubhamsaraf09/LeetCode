class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;int j=1;
        int sum=0;
        while(j<nums.length){
            sum+=nums[i];
            i+=2;j+=2;
        }
        return sum;
    }
}
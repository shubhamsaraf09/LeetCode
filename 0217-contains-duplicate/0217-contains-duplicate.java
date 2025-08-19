class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> table=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            table.add(nums[i]);
        }
        if(nums.length!=table.size()) return true;
        return false;
    }
}
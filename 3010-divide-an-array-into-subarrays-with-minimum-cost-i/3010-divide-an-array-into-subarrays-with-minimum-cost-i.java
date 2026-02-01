class Solution {
    public int minimumCost(int[] nums) {
        int ans=nums[0];
        ArrayList<Integer> list=new ArrayList<>();
        for (int num : nums) {
        list.add(num);
        }

        list.remove(0);
        Collections.sort(list);
        ans=ans+list.get(0)+list.get(1);
        return ans;
    }
}
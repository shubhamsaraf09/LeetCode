class Solution {
    public int maxRotateFunction(int[] nums) {
        int inisum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            inisum+=i*nums[i];
            sum+=nums[i];
        }
        // List<Integer> list=new ArrayList<>();
        // for(int x : nums) list.add(x);
        int curr=0;
        int max=Integer.MIN_VALUE;
        max=Math.max(inisum,max);
        for(int i=0;i<nums.length;i++){
            int n=inisum-nums[nums.length-1-i]*(nums.length-1)+sum-nums[nums.length-1-i];
            max=Math.max(max,n);
            // int a=list.remove(list.size()-1);
            // list.add(0,a);
            inisum=n;
        }
        return max;
    }
}
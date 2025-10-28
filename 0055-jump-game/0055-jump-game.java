class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int n=nums.length;
        if(n==1) return true;
        for(int i=0;i<n;i++){
            
            if(max<i) return false;
            int m=i+nums[i];
            max=Math.max(m,max);
            if(max>=n) return true;
        }
        return true;
    }
}
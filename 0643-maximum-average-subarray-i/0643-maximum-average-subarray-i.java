class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;int l=0;
        int r=k-1;
        double avg=0;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        double max=0;
        max=sum;
        while(r<nums.length-1){
            sum-=nums[l];
            
            l++;
            r++;
            sum+=nums[r];
            max=Math.max(sum,max);
        }
        avg=max/k;
        return avg;
    }
}
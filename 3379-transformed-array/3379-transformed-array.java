class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int st=Math.abs(nums[i]);
            int j=i;
            int k=1;
            int ans=0;
            if(nums[i]>0) while(k<=st%nums.length){
               
                j++;
                 if(j==nums.length) j=0;
                k++;
            }
            else while(k<=st%nums.length){
                
                j--;
                if( j<0) j=nums.length-1;
                k++;
            }
            result[i]=nums[j];

        }
        return result;
    }
}
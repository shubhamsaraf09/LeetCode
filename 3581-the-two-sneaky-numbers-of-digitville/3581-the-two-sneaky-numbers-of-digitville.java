class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i=0;
        int[] arr=new int[2];
        while(i<nums.length){
            int c=nums[i];
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }
            else i++;
        }
        i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                arr[i]=nums[j];
                i++;
            }
        }
        return arr;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int s=0,e=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=nums[i]) {
                s=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=nums[i]){
                e=i;
                break;
            }
        }

        if(e!=0 && s!=0) return e-s+1;
        else if((e!=0 || s!=0) && e>s) return e-s+1;
        else if((e!=0 || s!=0) && e<s) return s-e+1;
        else return 0;
    }
}
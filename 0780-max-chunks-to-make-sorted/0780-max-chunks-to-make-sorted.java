class Solution {
    public int maxChunksToSorted(int[] arr) {
       
        int sum=0,actualsum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            actualsum+=i;
            if(sum==actualsum) count++;
        }
        return count;
    }
}
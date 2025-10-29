class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int l=arr[0][1];
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<l)
                count++;
            else    l=arr[i][1];
            
        }
        return count;
    }
}
class Solution {
    public int getWinner(int[] arr, int k) {
        int c=0;
        int num=arr[0];
        for(int i=0;i<arr.length;i++){
            if(num>arr[i]) c++;
            if(c>=k) return num;
            if(num<arr[i]) num=arr[i];
        }
        return num;
    }
}
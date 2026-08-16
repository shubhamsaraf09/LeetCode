class Solution {
    public int getWinner(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],map.getOrDefault(arr[i],0));
            if(arr[i]>arr[i+1]) swap(arr,i,i+1);
            map.put(arr[i+1],map.getOrDefault(arr[i+1],0)+1);
            if(map.get(arr[i+1])>=k) return arr[i+1];
        }
        return arr[arr.length-1];
    }
    void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
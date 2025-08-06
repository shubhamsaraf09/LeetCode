class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        Arrays.fill(arr,0);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                arr[s.peek()]=i-s.pop();
            }
            
            s.push(i);
        }
        return arr;
    }
}
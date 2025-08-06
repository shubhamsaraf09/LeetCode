class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s=new Stack<>();
        int[] result=new int[temp.length];
        Arrays.fill(result,0);
        for(int i=0;i<temp.length;i++){
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                int index=s.pop();
                result[index]=i-index;
            }
            s.push(i);

        }
        return result;
    }
}
class Solution {
    public boolean find132pattern(int[] nums) {
        int max=Integer.MIN_VALUE;
        Stack<Integer> stack=new Stack<>();
        int length=nums.length;
        if(length<3) return false;
        for(int i=length-1;i>=0;i--){
            int curr= nums[i];
            if(curr<max) return true;
            while(!stack.isEmpty() && stack.peek()<curr){
                max=stack.pop();
            }
            stack.push(curr);
        }
        return false;
    }
}
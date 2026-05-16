class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin="";
        Stack<Integer> stack=new Stack<>();
        while(n!=0){
            stack.push(n%2);
            n=n/2;
        }
        int a=stack.pop();
        while(!stack.isEmpty()){
            if(a==stack.peek()) return false;
            a=stack.pop();
        }
        return true;
    }
}
class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        Stack<Integer> numstack=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
                
            }
            else if(ch=='['){
                stack.push(curr.toString());
                numstack.push(num);
                num=0;
                curr=new StringBuilder(); 
            }
            else if(ch==']'){
                int n=numstack.pop();
                StringBuilder temp=new StringBuilder(stack.pop());
                for(int i=0;i<n;i++){
                    temp.append(curr);
                }
                curr=temp;
            }

            else{
                curr.append(ch);
            }
        }
            return curr.toString();       
    }
}
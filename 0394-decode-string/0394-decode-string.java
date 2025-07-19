class Solution {
    public String decodeString(String s) {
        StringBuilder str=new StringBuilder();
        Stack<StringBuilder> stack=new Stack<>();
        Stack<Integer> numstack=new Stack<>();
        int num=0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                stack.push(str);
                str=new StringBuilder();
                numstack.push(num);
                num=0;
            }
            else if(ch==']'){
                int times=numstack.pop();
                StringBuilder temp=new StringBuilder(stack.pop());
                for(int i=0;i<times;i++){
                    temp.append(str);
                }
                str=temp;
            }
            else{
                str.append(ch);
            }
        }
                return str.toString();
    }
}
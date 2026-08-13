class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='#') {
                if(!stack.isEmpty())
                stack.pop();
            }
            else stack.push(ch);
        }
        String a="";
        for(char ch : stack){
            a+=ch;
        }

        Stack<Character> s1 = new Stack<>();

        
        for(char ch : t.toCharArray()){
            if(ch=='#') {
                if(!s1.isEmpty()) s1.pop();
            }
            else s1.push(ch);
        }
        String b="";
        for(char ch : s1){
            b+=ch;
        }
        if(a.length()!=b.length()) return false;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
}
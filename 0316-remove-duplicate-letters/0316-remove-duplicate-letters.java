class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastseen=new int[26];
        boolean[] seen=new boolean[26];
        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen[c-'a']==true) continue;
            while(!stack.isEmpty() && stack.peek()>c && lastseen[stack.peek()-'a']>i){
                seen[stack.pop()-'a']=false;
            }
            seen[c-'a']=true;
            stack.push(c);
        }
        StringBuilder str=new StringBuilder();
        for(char ch : stack){
            str.append(ch);
        }
        return str.toString();
    }
}
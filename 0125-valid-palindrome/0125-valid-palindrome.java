class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        int st=0;
        int e=s.length()-1;

        while(e>=st){
            if(!Character.isLetterOrDigit(s.charAt(st))) st++;
            else if(!Character.isLetterOrDigit(s.charAt(e))) e--;
            else{
                if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(e))) return false;
                st++;
                e--;
            }
        }
        return true;
    }
}
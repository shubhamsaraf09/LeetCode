class Solution {
    int count=0;
    public int strStr(String haystack, String needle) {
        count=haystack.length();
        return skip(haystack,needle);
    }
    int skip(String up,String check){
        if(up.isEmpty()) return -1;
        if(up.startsWith(check)){
            return (count-up.length());
        } 
        else{
            return skip(up.substring(1),check);
        }
    }
}
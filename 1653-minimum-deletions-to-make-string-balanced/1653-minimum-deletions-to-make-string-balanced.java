class Solution {
    public int minimumDeletions(String s) {
        int bcount=0;
        int deletion=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b') bcount++;
            if(bcount>0 && s.charAt(i)=='a') deletion=Math.min(deletion+1,bcount);
        }
        return deletion;
    }
}
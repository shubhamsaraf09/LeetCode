class Solution {
    public int numberOfSubstrings(String s) {
        int len=0;
        int lastseen[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
        lastseen[s.charAt(i)-97]=i;
        if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
            len+=1+Math.min(Math.min(lastseen[0],lastseen[1]),lastseen[2]);
        }            

        }
        return len;
    }
}
class Solution {
    public int myAtoi(String s) {
       s=s.trim();
       int i=0;
       long ans=0;
       int sign=1;
       if(s.length()==0) return 0;
       if(s.charAt(0)=='-') {
        sign=-1;
        i++;
       }
       if(s.charAt(0)=='+') {
        sign=1;
        i++;
       }
       while(i<s.length()){
        char ch = s.charAt(i);
        if(ch<'0' || ch>'9') break;
        ans*=10;
        ans+=ch-'0';
        if(ans*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;
       }
       return (int)(ans*sign);

    }
}
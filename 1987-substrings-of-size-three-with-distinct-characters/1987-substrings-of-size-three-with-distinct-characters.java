class Solution {
    public int countGoodSubstrings(String s) {
        
        int count=0;
        if(s.length()<3) return count;
        char one=s.charAt(0);
        char two=s.charAt(1);
        char three=s.charAt(2);
        int j=3;
        while(j<s.length()){
            if(one!=two && two!=three && three!=one) count++;
            one=two;
            two=three;
            three=s.charAt(j++);
        }
        if(one != two && two != three && three != one) count++;

        return count;
    }
}
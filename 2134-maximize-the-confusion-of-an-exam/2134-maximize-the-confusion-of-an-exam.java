class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(helper(s,k,'T'),helper(s,k,'F'));
    }
        int helper(String answerKey, int k, char ch){
        int l=0,r=0,zero=0,maxlen=0,len=0;
        while(r<answerKey.length()){
            if(answerKey.charAt(r)==ch) zero++;
            if(zero>k){
                if(answerKey.charAt(l)==ch) zero--;
                l++;
            }
            if(zero<=k) len=r-l+1;
            maxlen=Math.max(maxlen,len);
            r++;
        }
        return maxlen;
    }
}
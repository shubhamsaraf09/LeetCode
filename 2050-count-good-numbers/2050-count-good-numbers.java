class Solution {
    long m=1_000_000_007L;
    public int countGoodNumbers(long n) {
        
        long f=n/2;
        long s=n-f;
        long ans=mathpow(4,f)*mathpow(5,s);
        
        return (int)(ans%m); 
    }
    long mathpow(long base,long exp){
        long result=1;
        base%=m;
        while(exp>0){
            if(exp%2==1){
                result=(result*base)%m;
            }
            base=(base*base)%m;
            exp/=2;
        }
        return result;
    }
}
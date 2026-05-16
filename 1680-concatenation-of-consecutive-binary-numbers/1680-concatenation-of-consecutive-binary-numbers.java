class Solution {
    int mod=1000000007;
    public int concatenatedBinary(int n) {
        long ans=0;
        for(int i=0;i<=n;i++){
            ans=((ans<<nobits(i))%mod+i);
        }
        return (int)ans;
    }
    int nobits(int n){
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}
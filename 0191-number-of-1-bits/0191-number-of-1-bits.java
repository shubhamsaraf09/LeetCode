class Solution {
    int count=0;
    public int hammingWeight(int n) {
        while(n!=0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;
        }
        return count;
    }
}
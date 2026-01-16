class Solution {
    public int climbStairs(int n) {
       if(n==1) return 1;
        return count(n);
    }
    int count(int n){
        int f=1;
        int s=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=f+s;
            s=f;
            f=curr;
        }
        
        return curr;
    }
}
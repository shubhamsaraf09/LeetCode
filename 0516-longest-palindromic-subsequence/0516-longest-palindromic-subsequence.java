class Solution {
    public int longestPalindromeSubseq(String s) {
        String r=new StringBuilder(s).reverse().toString();
        int[][] dp=new int[s.length()][s.length()];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(s.length()-1,s.length()-1,s,r,dp);

    }
    int f(int n1,int n2,String s,String t,int[][] dp){
        if(n1<0 || n2<0) return 0;
        if(dp[n1][n2]!=-1) return dp[n1][n2];
        if(s.charAt(n1)==t.charAt(n2)) return 1+f(n1-1,n2-1,s,t,dp);
        return dp[n1][n2]=Math.max(f(n1-1,n2,s,t,dp),f(n1,n2-1,s,t,dp));
    }
}
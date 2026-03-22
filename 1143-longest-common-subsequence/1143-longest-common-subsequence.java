class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int[][] dp=new int[text1.length()][text2.length()];
        // for(int i[] : dp){
        //     Arrays.fill(i,-1);
        // }
        return f(text1,text2);
    }
    // int f(int n1,int n2,String text1,String text2,int[][] dp){
    //     if(n1<0 || n2<0) return 0;
    //     if(dp[n1][n2]!=-1) return dp[n1][n2];
    //     if(text1.charAt(n1)==text2.charAt(n2)) return 1+f(n1-1,n2-1,text1,text2,dp);
    //     return dp[n1][n2]=Math.max(f(n1-1,n2,text1,text2,dp),f(n1,n2-1,text1,text2,dp));
    // }

    int f(String s,String t){
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++) dp[i][0]=0;
        for(int i=0;i<=t.length();i++) dp[0][i]=0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                    if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                    else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s.length()][t.length()];
    }
}
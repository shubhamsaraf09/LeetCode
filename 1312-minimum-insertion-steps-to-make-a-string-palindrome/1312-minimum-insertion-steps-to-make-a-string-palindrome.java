class Solution {
    public int minInsertions(String s) {
        String r=new StringBuilder(s).reverse().toString();
        int p=lcs(s,r);
        return s.length()-p;
    }
    int lcs(String s,String r){
        int[][] dp=new int[s.length()+1][r.length()+1];
        for(int i=0;i<=s.length();i++){
            dp[0][i]=0;
            dp[i][0]=0;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==r.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[s.length()][r.length()];
    }
}
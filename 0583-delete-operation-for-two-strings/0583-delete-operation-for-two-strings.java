class Solution {
    public int minDistance(String word1, String word2) {
     
        int p=lcs(word1,word2);
        return word1.length()+word2.length()-2*p;
    }
    int lcs(String s,String r){
        int[][] dp=new int[s.length()+1][r.length()+1];
        for(int i=0;i<=r.length();i++){
            dp[0][i]=0;
            
        }
        for(int i=0;i<s.length();i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=r.length();j++){
                if(s.charAt(i-1)==r.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[s.length()][r.length()];
    }
}
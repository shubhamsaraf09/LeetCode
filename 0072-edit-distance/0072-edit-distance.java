class Solution {
    public int minDistance(String word1, String word2) {
        // int[][] dp=new int[word1.length()][word2.length()];
        // for(int[] i : dp){
        //     Arrays.fill(i,-1);
        // }
        // return f(word1.length()-1,word2.length()-1,word1,word2,dp);
        return f(word1,word2);
    }
    // int f(int i,int j,String s,String t,int[][] dp){
    //     if(i<0) return j+1;
    //     if(j<0) return i+1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(s.charAt(i)==t.charAt(j)) return dp[i][j]=f(i-1,j-1,s,t,dp);
    //     return dp[i][j]=1+Math.min(f(i-1,j-1,s,t,dp),Math.min(f(i-1,j,s,t,dp),f(i,j-1,s,t,dp)));
    // }
    int f(String s,String t){
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=t.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
            }
        }
        return dp[s.length()][t.length()];
    }
}
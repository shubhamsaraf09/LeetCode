class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return f(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
    int f(int i,int j,String s,String t,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=f(i-1,j-1,s,t,dp);
        return dp[i][j]=1+Math.min(f(i-1,j-1,s,t,dp),Math.min(f(i-1,j,s,t,dp),f(i,j-1,s,t,dp)));
    }
}
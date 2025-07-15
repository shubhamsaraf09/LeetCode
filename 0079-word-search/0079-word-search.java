class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(visited,board,word,0,i,j)) return true;
            }
        }
        return false;
    }

    boolean dfs(boolean[][] visited,char[][] board,String word,int index,int r,int c){
        if(index==word.length()) return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || visited[r][c] || board[r][c]!= word.charAt(index)) return false;

        visited[r][c]=true;

        boolean found=dfs(visited,board,word,index+1,r+1,c) ||dfs(visited,board,word,index+1,r,c+1) ||dfs(visited,board,word,index+1,r,c-1) ||dfs(visited,board,word,index+1,r-1,c);

        visited[r][c]=false;

        return found;
    }
}
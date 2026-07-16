class Solution {
    public int getMaximumGold(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        
        int answer=0; 
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0)
                answer=Math.max(answer,dfs(grid,i,j));
            }
        }
        return answer;
    }

    int dfs(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[r].length){
            return 0;
        }

        if(grid[r][c]==0) return 0;

        int gold = grid[r][c];

        grid[r][c]=0;

        int left=dfs(grid,r,c-1);
        int right=dfs(grid,r,c+1);
        int up = dfs(grid,r-1,c);
        int down = dfs(grid,r+1,c);

        grid[r][c]=gold;

        return gold+Math.max(Math.max(up,down),Math.max(right,left));
    }

}
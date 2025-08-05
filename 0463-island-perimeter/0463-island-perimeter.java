class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    perimeter+=dfs(grid,i,j);
                }
            }
        }
        return perimeter;
    }
    int dfs(int[][] grid,int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0) return 1;
        if(grid[r][c]==-1) return 0;
        grid[r][c]=-1;

        return dfs(grid,r+1,c)+dfs(grid,r-1,c)+dfs(grid,r,c+1)+dfs(grid,r,c-1);
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            
            for(int j=0;j<9;j++){
                if(Character.isDigit(board[i][j])){
                    if(!row.add(board[i][j]-'0')){
                        return false;
                    }
                }
                if(Character.isDigit(board[j][i])){
                    if(!col.add(board[j][i]-'0')){
                        return false;
                    }
                }
            }}
                for(int i=0;i<9;i+=3){
                    for(int j=0;j<9;j+=3){
                        Set<Integer> set = new HashSet<>();
                        for(int r=i;r<i+3;r++){
                            for(int c=j;c<j+3;c++){
                                if(Character.isDigit(board[r][c])){
                                    if(!set.add(board[r][c]-'0')) return false;
                                }
                            }
                        }
                    }
                
            
        }
        return true;
    }
}
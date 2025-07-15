class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        // Step 1: Mark all border-connected 'O' as safe ('S')
        for (int i = 0; i < n; i++) {
            dfs(i, 0, board);
            dfs(i, m - 1, board);
        }

        for (int j = 0; j < m; j++) {
            dfs(0, j, board);
            dfs(n - 1, j, board);
        }

        // Step 2: Flip all 'O' → 'X', and 'S' → 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    void dfs(int r, int c, char[][] board) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'O') {
            return;
        }

        board[r][c] = 'S'; // Mark as safe

        dfs(r + 1, c, board);
        dfs(r - 1, c, board);
        dfs(r, c + 1, board);
        dfs(r, c - 1, board);
    }
}

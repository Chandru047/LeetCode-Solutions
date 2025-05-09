class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(row, col, board, num)) {
                            board[row][col] = num;
                            if (solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, char[][] board, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch || board[i][col] == ch) return false;
            int blockRow = 3 * (row / 3) + i / 3;
            int blockCol = 3 * (col / 3) + i % 3;
            if (board[blockRow][blockCol] == ch) return false;
        }
        return true;
    }
}

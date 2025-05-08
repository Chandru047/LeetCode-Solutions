public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        solveNQueensHelper(n, 0, new int[n], result);
        return result;
    }

    private void solveNQueensHelper(int n, int row, int[] board, List<List<String>> result) {
        if (row == n) {
            result.add(generateBoard(board, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row] = col;
                solveNQueensHelper(n, row + 1, board, result);
                board[row] = -1;
            }
        }
    }

    private boolean isValid(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    private List<String> generateBoard(int[] board, int n) {
        List<String> boardList = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < n; col++) {
                if (board[row] == col) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            boardList.add(sb.toString());
        }
        return boardList;
    }

}

package problems.backtracking.sudoku_37;

public class Solution {
    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, i, j, ch)) {
                            board[i][j] = ch;

                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean recursionSolve(char[][] board, int i, int j){
        if(j == 9){
            return recursionSolve(board, i + 1, 0);
        }
        if(i == 9){
            return true;
        }

        if(board[i][j] != '.'){
            return recursionSolve(board, i, j + 1);
        }

        for(char ch = '1'; ch <= '9'; ch++){
            if (isValid(board, i, j, ch)) {
                board[i][j] = ch;

                if(recursionSolve(board, i, j + 1)){
                    return true;
                }
                board[i][j] = '.';
            }
        }

        return false;
    }

    //row = 5, col = 3
    private static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            if (board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == ch) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solve(board);
    }
}

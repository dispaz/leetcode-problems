package problems.backtracking.wordsearch_79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if (board[i][j] == word.charAt(0)) {
                    boolean result = recExist(board, i, j, word, 0);
                    if(result) return true;
                }
            }
        }
        return false;
    }

    private boolean recExist(char [][] board, int i, int j, String word, int index){
        if(word.length() <= index){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length) return false;
        if(board[i][j] != word.charAt(index)) return false;
        char temp = board[i][j];
        board[i][j] = '-';
        boolean result = recExist(board, i, j + 1, word, index + 1)
                || recExist(board, i + 1, j, word, index + 1)
                || recExist(board, i, j - 1, word, index + 1)
                || recExist(board, i - 1, j, word, index + 1);
        board[i][j] = temp;
        return result;
    }
}


package arrayproblems.tictactoewinner_1275;

public class Solution {
    int [] winCombinations = new int[] {7,56,448,73,146,292,273,84}; //binary representation of winning combinations
    public String tictactoe(int[][] moves) {
        int gridA = 0, gridB = 0;
        for(int i = 0; i < moves.length; i++){
            int move = 1 << (moves[i][0] * 3 + moves[i][1]);
            if(i % 2 == 0){
                gridA = gridA | move;
                if(playerWon(gridA)) return "A";
            }
            else{
                gridB = gridB | move;
                if(playerWon(gridB)) return "B";
            }
        }
        if((gridA | gridB) == 511) return "Draw";
        return "Pending";
    }

    private boolean playerWon(int grid){
        for(int comb : winCombinations){
            if((grid & comb) == comb)
                return true;
        }
        return false;
    }
}

package problems.greedy.scoreafterflippingmatrix_861;

public class Solution {
    public int matrixScore(int[][] A) {
        int M = A.length, N = A[0].length, res = (1 << (N - 1)) * M;            //res = score of first column

        for(int j = 1; j < N; j++){
            int colMaxOnes = 0;
            for(int i = 0; i < M; i++){
                colMaxOnes += A[i][j] == A[i][0] ? 1 : 0;                       // calculate how many ones is in columns (before and after flip)
            }

            res += Math.max(colMaxOnes, M - colMaxOnes) * (1 << (N - j - 1));   //get maximum possible ones in column and multiply by score of column
        }

        return res;
    }
}

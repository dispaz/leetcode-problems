package arrayproblems.sortmatrixdiagonally_1329;

import java.util.Arrays;

public class Solution {
    public static int[][] diagonalSort(int[][] mat) {
        int x = mat[0].length, y = mat.length;
        int maxsize = x < y ? x : y;
        for(int i = 0; i < y - 1; i++){
            for(int j = 0; j < (i > 0 ? 1 : x - 1); j++){
                int size = maxsize;
                if(x - j < maxsize)
                    size = x - j;
                if(y - i < maxsize)
                    size = y - i;
                int [] diag = new int[size];

                for(int k = 0; k < diag.length; k++){
                    diag[k] = mat[i + k][j + k];
                }

                Arrays.sort(diag);

                for(int k = 0; k < diag.length; k++){
                    mat[i + k][j + k] = diag[k];
                }
            }
        }
        return mat;
    }
    public static void main(String [] args){
        int[][] mat = {
            {3,1,5},{4,3,9},{5,7,1},{8,4,2},{1,9,3}};
        diagonalSort(mat);
    }
}

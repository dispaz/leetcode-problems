package dynamicprogramming.uniquepath_62;

public class Solution {
    public int uniquePaths(int m, int n) {
        int [][] arr = new int [m][n];
        arr[0][0] = 1;
        for(int i = 0, j = 1; i < m; i++, j = 0){
            for(; j < n; j++){
                int left = j > 0 ? arr[i][j - 1] : 0;
                int up = i > 0 ? arr[i - 1][j] : 0;
                arr[i][j] = left + up;
            }
        }
        return arr[m - 1][n - 1];
    }
}

package problems.heap.kthsmallestelementinmatrix_378;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                heap.add(matrix[i][j]);
                if(k < heap.size())
                    heap.poll();
            }
        }
        return heap.peek();
    }
}

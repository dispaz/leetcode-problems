package problems.heap.kthclosestpointorigin_973;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    //problems.heap solution
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return getDistanceToOrigin(o2) - getDistanceToOrigin(o1);
            }
        });

        for(int[] point : points){
            heap.add(point);
            if(heap.size() > K){
                heap.poll();
            }
        }

        return heap.toArray(new int [K][2]);
    }

    //Sort solution
    public int[][] sortKClosest(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> getDistanceToOrigin(p2) - getDistanceToOrigin(p1));
        return Arrays.copyOfRange(points, 0, K);
    }

    //add quick select solution

    private int getDistanceToOrigin(int [] point){
        System.out.println("x= " + point[0] + " y= " + point[1]);
        return point[0] * point[0] + point[1] * point[1];
    }
}

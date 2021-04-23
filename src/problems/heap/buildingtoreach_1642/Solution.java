package problems.heap.buildingtoreach_1642;

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0 ; i < heights.length - 1; i++){
            int d = heights[i + 1] - heights[i];
            if(d > 0){
                heap.add(d);
            }
            if(heap.size() > ladders){
                bricks -= heap.poll();
            }
            if(bricks < 0){
                return i;
            }
        }
        return heights.length - 1;
    }
}

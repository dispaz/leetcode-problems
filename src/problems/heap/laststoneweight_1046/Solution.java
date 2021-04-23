package problems.heap.laststoneweight_1046;

import java.util.*;

public class Solution {
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int s : stones){
            heap.offer(s);
        }
        while(!heap.isEmpty()){
            if(heap.size() == 1) return heap.poll();
            int diff = heap.poll() - heap.poll();
            if(diff > 0){
                heap.offer(diff);
            }
        }

        return 0;
    }

    /*
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new ArrayList();
        for(int x : stones){
            list.add(0, x);
        }

        while (!list.isEmpty()) {
            if (list.size() == 1) return list.get(0);
            int y = list.remove(0);
            int x = list.remove(0);
            int abs = Math.abs(y - x);
            System.out.println("y: " + y + " x: " + x + " abs: " + abs);
            if (abs > 0) {
                if (!list.isEmpty()) {
                    int i = 0;
                    for (; i < list.size(); i++) {
                        if (abs > list.get(i)) {
                            list.add(i, abs);
                            break;
                        }
                    }
                    if(i == list.size())
                    {
                        list.add(abs);
                    }
                }
                else{
                    list.add(abs);
                }
            }
        }
        return 0;
    }
     */


    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));

    }
}

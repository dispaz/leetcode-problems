package heap.topkfrequentelements_347;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        for(int index : map.keySet()){
            heap.offer(index);
        }

        int [] result = new int[k];
        while(k-- > 0){
            result[k] = heap.poll();
        }
        return result;
    }
    public static void main(String [] args){
        printArr(topKFrequent(new int [] {1,4,1,2,3,1,4, 2, 1, 3, 2},4));
    }

    private static void printArr(int [] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

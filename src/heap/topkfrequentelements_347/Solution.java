package heap.topkfrequentelements_347;

import java.util.*;

public class Solution {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static int[] topKFrequent(int[] nums, int k) {
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int size = map.size();
        int [] arr = new int[size];
        int i = 0;
        for(int x : map.keySet()){
            arr[i] = x;
            i++;
        }
        printArr(arr);
        quickselect(arr, size - k);

        return Arrays.copyOfRange(arr, size - k, size);
    }
    private static void quickselect(int [] arr, int k){
        int start = 0;
        int end = arr.length - 1;

        Random rand = new Random(0);
        while(start <= end){
            printArr(arr);
            int pivotIndex = rand.nextInt(end - start + 1) + start;
            int tail = partition(arr, start, end, pivotIndex);
            if(tail == k){
                return;
            }
            if(tail > k){
                end = tail - 1;
            }
            else {
                start = tail + 1;
            }
        }
    }
    private static int partition(int [] arr, int start, int end, int pivotIndex){
        int pivot = map.get(arr[pivotIndex]);
        int tail = start;

        swap(arr, pivotIndex, end);

        for(int i = start; i < end; i++){
            if(map.get(arr[i]) < pivot){
                swap(arr, i, tail);
                tail++;
            }
        }

        swap(arr, tail, end);

        return tail;
    }

    private static void swap(int [] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static int[] topKFrequentHeap(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        printMap(map);

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        for (int index : map.keySet()) {
            heap.offer(index);
        }

        int[] result = new int[k];
        while (k-- > 0) {
            result[k] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,1,1,1,3,73,1};
        int k = 1;

        printArr(topKFrequent(arr, k));
    }

    private static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void printMap(HashMap<Integer, Integer> map) {
        for (int x : map.keySet()) {
            System.out.println("key: " + x + " value: " + map.get(x));
        }
    }
}

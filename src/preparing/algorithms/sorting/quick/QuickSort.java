package preparing.algorithms.sorting.quick;

import java.util.Random;

public class QuickSort {
    private static Random rand = new Random();

    public static void quickSort(int [] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int [] arr, int start, int end){
        if(start < end){
            int pivot = r_partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int r_partition(int [] arr, int start, int end){
        int pivot_index = rand.nextInt(end - start) + start;
        swap(arr, end, pivot_index);
        return partition(arr, start, end);
    }
    
    private static int partition(int [] arr, int start, int end){
        int pivot = arr[end];
        int j = start;
        for(int i = start; i < end; i++){
            if(arr[i] < pivot){
                swap(arr, i, j++);
            }
        }
        swap(arr, j, end);
        return j;
    }

    private static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

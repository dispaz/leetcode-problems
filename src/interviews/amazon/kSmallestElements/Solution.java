package interviews.amazon.kSmallestElements;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    /*
    Find the k smallest elements in array
    example:
    input: [1, 4, 2, 6, 3, 7], 3
    output: [1, 2, 3]
     */
    public static int [] kSmallestElements(int [] arr, int k ){
        if(k >= arr.length) return arr;
        if(arr.length == 0 && k <= 0) return new int[0];
        
        int start = 0, end = arr.length - 1;
        Random rand = new Random();
        while(start < end){
            int pivotIndex = rand.nextInt(end - start) + start;
            int result = partition(start, end, pivotIndex, arr);
            if(result == k - 1)
                break;

            if(result > arr.length - k){
                end = result - 1;
            } else {
                start = result + 1;
            }
        }

        return Arrays.copyOfRange(arr, 0, k);
    }

    private static int partition(int start, int end, int pivotIndex, int [] arr){
        int pivot = arr[pivotIndex];
        swap(pivotIndex, end, arr);
        int j = start;
        for(int i = start; i < end; i++){
            if(arr[i] < pivot){
                swap(i, j, arr);
                j++;
            }
        }
        swap(j, end, arr );
        return j;
    }

    private static void swap(int first, int second, int [] arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String [] args){
        int [] arr = new int [] {1, 4, 2, 6, 3, 7};
        int k = 3;
        printArr(arr);
        int [] result = kSmallestElements(arr, k);
        printArr(result);
    }

    public static void printArr(int [] arr){
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}

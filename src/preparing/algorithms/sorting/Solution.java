package preparing.algorithms.sorting;

import static preparing.algorithms.sorting.merge.MergeSort.mergeSort;

public class Solution {
    public static void main(String [] args){
        int [] a = new int[] {4, 9, 6, 1, 10, 5, 2, 7, 8, 3, 11, 16, 13, 12, 14, 19, 15, 20, 17, 18};
        printArr(a);
        mergeSort(a);
        printArr(a);
    }

    private static void printArr(int [] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

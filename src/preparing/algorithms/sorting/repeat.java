package preparing.algorithms.sorting;

public class repeat {
    private static void reccursionQuickSort(int [] a, int start, int end){
        if(start < end){
            int pi = partition_r(a, start, end);
            reccursionQuickSort(a, start, pi - 1);
            reccursionQuickSort(a, pi + 1, end);
        }
    }
    private static int partition_r(int [] a, int start, int end){
        int pivot = rand.nextInt(end - start) + start;
        swap(a, pivot, end);
        return partition(a, start, end);
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        int i = start;
        for(int j = start; j < end; j++){
            if(arr[j] < pivot){
                swap(arr, i++, j);
            }
        }
        swap(arr, i, end);
        return i;
    }

    private static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

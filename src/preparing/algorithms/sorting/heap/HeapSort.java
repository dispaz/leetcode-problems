package preparing.algorithms.sorting.heap;

public class HeapSort {
    public static void heapSort(int [] arr){
        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int [] arr, int n, int i ){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
}

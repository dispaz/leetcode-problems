package preparing.algorithms.sorting.merge;

public class MergeSort {
    public static void mergeSort(int [] arr){
        mergeSort_r(arr, 0, arr.length - 1);
    }

    private static void mergeSort_r(int [] arr, int start, int end){
        if(start < end){
            int mid = (end + start) / 2;
            mergeSort_r(arr, start, mid);
            mergeSort_r(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int arr[], int start, int mid, int end){
        int nl = mid - start + 1;
        int nr = end - mid;

        int [] leftarr = new int[nl];
        int [] rightarr = new int[nr];
        for(int i = 0; i < nl; i++){
            leftarr[i] = arr[start + i];
        }
        for(int i = 0; i < nr; i++){
            rightarr[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = start;
        while(i < nl && j < nr){
            if(leftarr[i] < rightarr[j]){
                arr[k] = leftarr[i++];
            } else {
                arr[k] = rightarr[j++];
            }
            k++;
        }

        while(i < nl){
            arr[k++] = leftarr[i++];
        }

        while(j < nr){
            arr[k++] = rightarr[j++];
        }
    }
}

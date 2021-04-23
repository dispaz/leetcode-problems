package problems.heap.kthlargestinarray_215;

import java.util.PriorityQueue;
import java.util.Random;

public class Solution {
    public int badFindKthLargest(int[] nums, int k) {
        int result = -1;
        for(int i = 0; i < k; i++){
            int index = 0;
            for(int j = 0; j < nums.length; j++){
                if(j > index && nums[j] > nums[index]){
                    index = j;
                }
            }
            if(index < nums.length)
                result = nums[index];
        }
        return result;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int x : nums){
            queue.offer(x);
            if(queue.size() > k) queue.poll();

        }
        return queue.peek();
    }

    private static void printArr(int [] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static int partition(int [] arr, int start, int end, int pivotIndex){
        int pivot = arr[pivotIndex];
        int tail = start;

        swap(arr, pivotIndex, end);

        for(int i = start; i < end; i++){
            if(arr[i] < pivot){
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

    public static void main(String [] args){
        Random rand = new Random(0);
        int [] arr = new int[] {4, 6, 1, 5, 2, 7, 3};
        int start = 0;
        int end = arr.length - 1;
        int k = 4;
        int n = arr.length;
        while(start <= end){
            int pivotIndex = rand.nextInt(end - start + 1) + start;
            System.out.println("\npivot index: " + pivotIndex);
            printArr(arr);

            int result = partition(arr, start, end, pivotIndex);
            printArr(arr);
            System.out.println(result);

            if(result == n - k){
                System.out.println(arr[result]);
                break;
            }
            else if(result > n - k){
                end = result - 1;
            }
            else{
                start = result + 1;
            }
        }
    }
}
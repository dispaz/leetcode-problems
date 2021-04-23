package problems.arrayproblems.runningsum_1480;

public class RunningSum_1480 {
    public int[] runningSum(int [] arr){
        calculateSum(arr, arr.length - 1);
        return arr;
    }
    private void calculateSum(int [] arr, int offset){
        if(offset == 0){
            return;
        }
        calculateSum(arr, offset - 1);
        arr[offset] += arr[offset - 1];
    }
}

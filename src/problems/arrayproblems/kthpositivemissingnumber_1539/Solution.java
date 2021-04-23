package problems.arrayproblems.kthpositivemissingnumber_1539;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[0] > k)
            return k;

        k -= (arr[0] - 1);

        for(int i = 1; i < arr.length && k > 0; i++){
            int diff = arr[i] - arr[i - 1] - 1;
            if(diff > 0){
                if(k - diff <= 0)
                    return arr[i - 1] + k;

                k -= diff;
            }
        }

        return arr[arr.length - 1] + k;
    }
}

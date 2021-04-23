package problems.arrayproblems.duplicatezeros_1089;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for(int x : arr){
            if(x == 0) count++;
        }

        for(int i = arr.length - 1, j = count + arr.length - 1; i < j; i--, j--){
            if(arr[i] != 0){
                if(j < arr.length) arr[j] = arr[i];
            }
            else{
                if(j < arr.length) arr[j] = arr[i];
                j--;
                if(j < arr.length) arr[j] = arr[i];
            }
        }
    }
}

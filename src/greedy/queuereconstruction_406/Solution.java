package greedy.queuereconstruction_406;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        bubbleSortPeople(people);
        // Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> res = new LinkedList();
        for(int [] p : people){
            res.add(p[1], p);
        }

        return res.toArray(new int[people.length][]);
    }

    void bubbleSortPeople(int[][]arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i < n; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j][0] < arr[j + 1][0]){
                    int [] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                else if (arr[j][0] == arr[j + 1][0]){
                    if(arr[j][1] > arr[j + 1][1])
                    {
                        int [] temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if(!swapped) break;
        }
    }
}

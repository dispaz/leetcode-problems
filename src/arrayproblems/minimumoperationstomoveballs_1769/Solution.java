package arrayproblems.minimumoperationstomoveballs_1769;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] minOperations(String boxes) {
        int [] result = new int[boxes.length()];
        int count = 0, ops = 0;
        for(int i = 0; i < result.length; i++){
            result[i] += ops;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            ops += count;
        }
        count = 0;
        ops = 0;

        for(int i = result.length - 1; i >= 0; i--){
            result[i] += ops;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            ops += count;
        }
        return result;
    }
    //my
    public int[] minOperations2(String boxes) {
        List<Integer> indexes = new ArrayList();

        for(int i = 0; i < boxes.length(); i++){
            if(boxes.charAt(i) == '1')
                indexes.add(i);
        }

        int[] result = new int[boxes.length()];

        for(int i = 0; i < result.length; i++){
            for(int index : indexes){
                result[i] += Math.abs(index - i);
            }
        }

        return result;
    }
}

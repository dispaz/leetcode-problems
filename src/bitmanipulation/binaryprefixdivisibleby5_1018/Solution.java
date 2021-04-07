package bitmanipulation.binaryprefixdivisibleby5_1018;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> prefixesDivBy5(int[] A) {
        int number = 0;
        List<Boolean> res = new ArrayList();
        for(int i = 0; i < A.length; i++){
            number = (number << 1 | A[i]) % 5;
            res.add(number == 0);
        }

        return res;
    }

    public static void main(String [] args){
        prefixesDivBy5(new int[] {0,1,0,1,1,1,0,1,1,1,0,0,0,1});
    }
}

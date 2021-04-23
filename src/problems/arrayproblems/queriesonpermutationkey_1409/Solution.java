package problems.arrayproblems.queriesonpermutationkey_1409;

import java.util.LinkedList;

public class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> P = new LinkedList();
        for(int i = 1; i <= m; i++){
            P.add(i);
        }

        int [] res = new int[queries.length];
        for(int i = 0; i < res.length; i++){
            int idx = P.indexOf(queries[i]);
            P.remove(idx);
            P.addFirst(queries[i]);
            res[i] = idx;
        }

        return res;
    }

    public static void main(String [] args){
        int val = 10;
        System.out.println(Integer.toBinaryString(val) + " & " + Integer.toBinaryString(-val) + " = " + Integer.toBinaryString((val & -val)));
    }
}

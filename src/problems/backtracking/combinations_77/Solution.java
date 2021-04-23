package problems.backtracking.combinations_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList();
        backtrack(list, new ArrayList<Integer>(), 1, n, k);
        return list;
    }

    void backtrack(List<List<Integer>> list, List<Integer> templist, int index, int n, int k){
        if(templist.size() == k){
            list.add(new ArrayList(templist));
            return;
        }

        for(int i = index; i <= n; i++){
            templist.add(i);

            backtrack(list, templist, i + 1, n, k);
            templist.remove(templist.size() - 1);
        }
    }
}

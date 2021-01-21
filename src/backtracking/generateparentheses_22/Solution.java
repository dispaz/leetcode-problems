package backtracking.generateparentheses_22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> list, StringBuilder str, int open, int close, int n){
        if(str.length() == n * 2){
            list.add(str.toString());
            return;
        }

        if(open < n){
            backtrack(list, str.append("("), open + 1, close, n);
            str.deleteCharAt(str.length() - 1);
        }
        if(close < open){
            backtrack(list, str.append("("), open, close + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}

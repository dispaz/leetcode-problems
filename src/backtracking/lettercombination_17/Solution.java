package backtracking.lettercombination_17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private String[] phone = new String[] {
            "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()) return result;
        backtrack(result, new StringBuilder(), digits);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder combination, String digits){
        if(digits.length() == 0){
            result.add(combination.toString());
            return;
        }
        int di = digits.charAt(0) - '2';
        for(int i = 0; i < phone[di].length(); i++){
            StringBuilder str = new StringBuilder();
            str.append(combination);
            str.append(phone[di].charAt(i));
            backtrack(result, str, digits.substring(1));
        }
    }
}

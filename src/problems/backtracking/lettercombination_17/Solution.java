package problems.backtracking.lettercombination_17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private String[] phone = new String[] {
            "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList();
        if(!digits.isEmpty())
            backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    public void backtrack(List<String> result, StringBuilder combination, String digits, int index){
        if(index >= digits.length()){
            result.add(combination.toString());
            return;
        }

        char[] arr = phone[digits.charAt(index) - '2'].toCharArray();

        for(char ch : arr){
            combination.append(ch);
            backtrack(result, combination, digits, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}

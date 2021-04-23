package problems.greedy.minimumaddtovalidparentheses_921;

public class Solution {
    public int minAddToMakeValid(String S) {
        int open = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                open++;
            } else {
                open = open > 0 ? open - 1 : 0;
            }
        }
        int closed = 0;
        for(int i = S.length() - 1; i >= 0; i--){
            if(S.charAt(i) == ')'){
                closed++;
            } else {
                closed = closed > 0 ? closed - 1 : 0;
            }
        }
        return open + closed;
    }
}

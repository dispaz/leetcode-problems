package problems.string.numberofsegmentsinstring_434;

public class Solution {
    public int countSegments(String s) {
        int res = s.length() > 0 && s.charAt(0) != ' ' ? 1 : 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                res++;
            }
        }

        return res;
    }
}

package greedy.issubsequence_392;

public class Solution {
    public boolean isSubsequence(String s, String t){
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;

            }
            i++;
        }

        if(j == t.length()) return true;

        return false;
    }
}

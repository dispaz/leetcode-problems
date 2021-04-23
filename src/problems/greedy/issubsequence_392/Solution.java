package problems.greedy.issubsequence_392;

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

    public boolean isSubsequence2(String s, String t){
        int p = -1;
        for(int i = 0; i < s.length(); i ++){
            p = t.indexOf(s.charAt(i), p + 1);
            if(p == -1) return false;
        }
        return true;
    }
}

package problems.string.lengthoflastword_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && count > 0)
                break;

            count += s.charAt(i) != ' ' ? 1 : 0;
        }

        return count;
    }
}

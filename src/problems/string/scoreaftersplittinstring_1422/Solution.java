package problems.string.scoreaftersplittinstring_1422;

public class Solution {
    public int maxScore(String s) {
        int right = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                right++;
        }

        int left = 0;
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0')
                left++;
            else
                right--;

            if(max < left + right)
                max = left + right;
        }
        return max;
    }
}

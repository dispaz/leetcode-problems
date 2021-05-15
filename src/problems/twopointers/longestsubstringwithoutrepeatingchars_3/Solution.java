package problems.twopointers.longestsubstringwithoutrepeatingchars_3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int r = 0, l = 0, result = 0;

        for(; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            result = Math.max(result, r + 1 - l);
        }

        return result;
    }
}

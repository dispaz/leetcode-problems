package problems.string.largestsubstringbetweenchars_1624;

import java.util.HashMap;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int max = -1;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i + 1);
            }
        }

        if(map.size() == s.length()) return max;

        for(int i = s.length() - 1; i >= 0; i--){
            if(max > i){
                break;
            }
            if(max < i - map.get(s.charAt(i))){
                max = i - map.get(s.charAt(i));
            }
        }
        return max;
    }
}

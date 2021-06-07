package problems.slidingwindow.minimumwindow_76;

import java.util.HashMap;

public class Solution {
    public String minWindow(String str, String pattern) {
        HashMap<Character, Integer> map = new HashMap();
        int start = 0, matches = 0;
        int startStr = 0, minLength = str.length() + 1;
        for(char ch : pattern.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int end = 0; end < str.length(); end++){
            char right = str.charAt(end);
            if(map.containsKey(right)){
                map.put(right, map.get(right) - 1);
                if(map.get(right) == 0)
                    matches++;
            }

            while(matches == map.size()){
                if(minLength > end - start + 1){
                    minLength = end - start + 1;
                    startStr = start;
                }
                char left = str.charAt(start++);
                if(map.containsKey(left)){
                    if(map.get(left) == 0)
                        matches--;

                    map.put(left, map.get(left) + 1);
                }
            }
        }
        return minLength > str.length() ? "" : str.substring(startStr, startStr + minLength);
    }
}

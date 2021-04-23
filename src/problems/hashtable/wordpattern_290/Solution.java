package problems.hashtable.wordpattern_290;

import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap mapP = new HashMap();

        for(Integer i = 0; i < pattern.length(); i++){
            if(!mapP.containsKey(pattern.charAt(i))){
                mapP.put(pattern.charAt(i), i);
            }

            if(!mapP.containsKey(arr[i])){
                mapP.put(arr[i], i);
            }

            if(mapP.get(arr[i]) != mapP.get(pattern.charAt(i)))
                return false;
        }

        return true;
    }
}

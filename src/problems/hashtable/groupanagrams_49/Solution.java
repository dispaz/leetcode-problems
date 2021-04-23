package problems.hashtable.groupanagrams_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String encoded = encodeString(str);
            if(!map.containsKey(encoded)) {
                map.put(encoded, new ArrayList<>());
            }
            map.get(encoded).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String encodeString(String s) {
        char[] arr = new char[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }

        return new String(arr);
    }
}

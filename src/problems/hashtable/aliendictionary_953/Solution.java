package problems.hashtable.aliendictionary_953;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character, Integer> map;
    public boolean isAlienSorted(String[] words, String order) {
        map = new HashMap();
        for(int i = 0; i < order.length(); i++){
            map.put(order.charAt(i), i);
        }

        for(int i = 0; i < words.length - 1; i++){
            if(!help(words, i)) return false;
        }

        return true;
    }

    boolean help(String [] words, int i){
        char[] word1 = words[i].toCharArray();
        char[] word2 = words[i + 1].toCharArray();
        int j = 0, k = 0;

        while(j < word1.length && k < word2.length){
            if(map.get(word1[j]) < map.get(word2[k])) return true;
            else if(map.get(word1[j]) > map.get(word2[k])) return false;
            j++; k++;
        }
        if(word1.length - j > word2.length - k) return false;
        return true;
    }
}

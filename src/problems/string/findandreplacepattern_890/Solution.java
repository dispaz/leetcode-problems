package problems.string.findandreplacepattern_890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList();
        for(String word : words){
            if(wordMatches(word, pattern)){
                res.add(word);
            }
        }

        return res;
    }

    private boolean wordMatches(String word, String pattern){
        Map<Character, Character> map = new HashMap();
        boolean [] seen = new boolean[26];

        for(int i = 0; i < word.length(); i++){
            char p = pattern.charAt(i);
            char w = word.charAt(i);

            if(!map.containsKey(w) && !seen[p - 'a']){
                map.put(w, p);
                seen[p - 'a'] =  true;
            }

            if(p != map.getOrDefault(w, '\0')){
                return false;
            }
        }

        return true;
    }
}

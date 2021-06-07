package problems.slidingwindow.substringwithconcatenation_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findSubstring(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int wordLength = words[0].length(), size = words.length;
        for(int i = 0; i <= str.length() - wordLength * size; i++){
            HashMap<String, Integer> seen = new HashMap<>();
            for(int j = 0; j < size; j++){
                int index = i + j * wordLength;
                String word = str.substring(index, index + wordLength);
                if(!map.containsKey(word)){
                    break;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if(seen.get(word) > map.getOrDefault(word, 0))
                    break;

                if(j + 1 == size){
                    resultIndices.add(i);
                }
            }
        }
        return resultIndices;
    }
}

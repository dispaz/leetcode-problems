package problems.string.mostcommonword_819;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] arr = paragraph.split("!|\\?|\\'|\\,|\\;|\\.|\\s");
        HashSet<String> set = new HashSet(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap();
        String result = "";
        int max = 0;
        for(String word : arr){
            word = word.toLowerCase();
            if(set.contains(word) || word.isEmpty()){
                continue;
            }
            int count = map.getOrDefault(word, 0) + 1;
            if(count > max){
                max = count;
                result = word;
            }
            map.put(word, count);
        }

        return result;
    }
    public static void main(String [] args){
        String paragraph = "Bob. hIt, baLl";
        String [] banned = new String [] {"bob", "hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}

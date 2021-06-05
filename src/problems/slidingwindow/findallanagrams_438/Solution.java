package problems.slidingwindow.findallanagrams_438;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        int[] map = new int[26];
        for(char ch : pattern.toCharArray()){
            map[ch - 'a']++;
        }

        int start = 0, end = 0;
        int[] strMap = new int[26];

        for(; end < str.length(); end++){
            char rightCh = str.charAt(end);
            strMap[rightCh - 'a']++;

            if(matches(map, strMap))
                resultIndices.add(start);

            if(end >= pattern.length() - 1){
                char leftCh = str.charAt(start++);
                strMap[leftCh - 'a']--;
            }
        }

        return resultIndices;
    }

    private boolean matches(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}

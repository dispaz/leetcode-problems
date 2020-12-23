package hashtable.validanagram_242;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public boolean useHashTable(String s, String t){
        int [] charsCount = new int[25];
        char[] arr1 = s.toCharArray();
        for(char ch : arr1){
            int index = ch - 'a';
            charsCount[index]++;
        }
        char [] arr2 = t.toCharArray();
        for(char ch : arr2){
            int index = ch - 'a';
            charsCount[index]--;
            if(charsCount[index] < 0){
                return false;
            }
        }

        return true;
    }
}

package problems.string.strstr_28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(needle.length() > haystack.length()) return -1;
        int i = 0;
        while(i != haystack.length() ){
            int j = 0;
            if(haystack.length() - i < needle.length()) return -1;
            while(j != needle.length()){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                j++;
            }

            if(j == needle.length()){
                return i;
            }
            i++;
        }
        return -1;
    }
}

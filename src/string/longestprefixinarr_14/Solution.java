package string.longestprefixinarr_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int min = getMin(strs);
        StringBuilder sb = new StringBuilder();
        char c = '\0';
        for(int i = 0; i < min; i++){
            for(String str : strs){
                if(c == '\0')
                    c = str.charAt(i);
                else {
                    if(c != str.charAt(i))
                        return sb.toString();
                }
            }
            sb.append(c);
            c = '\0';
        }
        return sb.toString();
    }

    int getMin(String[] strs){
        int min = Integer.MAX_VALUE;
        for(String str : strs){
            if(min > str.length()){
                min = str.length();
            }
        }
        return min;
    }
}

package string.makestringgood_1544;

public class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = sb.length() - 1; i > 0; i--){
            if(i > sb.length() - 1) {
                continue;
            }

            char ch = Character.isUpperCase(sb.charAt(i)) ? Character.toLowerCase(sb.charAt(i)) : Character.toUpperCase(sb.charAt(i));
            if(ch == sb.charAt(i - 1)){
                sb.delete(i - 1, i + 1);
            }
        }

        return sb.toString();
    }
}

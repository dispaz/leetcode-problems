package string.rotatestring_796;

public class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);
    }

    public boolean rotateString2(String A, String B) {
        if(A.equals(B)) return true;
        if(A.length() != B.length()) return false;

        StringBuilder str = new StringBuilder(A);
        for(int i = 0; i < str.length(); i++){
            if(B.equals(str.toString())){
                return true;
            }

            str.append(str.charAt(0));
            str.deleteCharAt(0);
        }
        return false;
    }
}

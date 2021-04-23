package problems.string.palindrome_125;

public class Solution {
    public boolean isPalindrome(String str) {
        if(str.isEmpty()) return true;
        String s = str.toLowerCase();
        int i = 0, j = s.length() - 1;
        while(i != j){
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            if(!isLetterOrDigit(leftChar)){
                i++;
                continue;
            }
            if(!isLetterOrDigit(rightChar)){
                j--;
                continue;
            }
            if(leftChar != rightChar) return false;
            if(i + 1 == j || i == j - 1) break;
            i++; j--;
        }
        return true;
    }

    private boolean isLetterOrDigit(char ch){
        char[] letters = new char[]{'A', 'Z', 'a', 'z', '0', '9'};
        if(ch >= letters[0] && ch <= letters[1] ||
                ch >= letters[2] && ch <= letters[3] ||
                ch >= letters[4] && ch <= letters[5]){
            return true;
        }
        return false;
    }
}
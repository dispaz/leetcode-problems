package problems.math.is_palindrome_9;

public class Solution {
    public static boolean isPalindrome(int x){
        int value = x, reversed = 0;
        while(value != 0){
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return reversed == x;
    }
}

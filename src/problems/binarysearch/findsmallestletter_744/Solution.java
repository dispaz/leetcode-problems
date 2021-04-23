package problems.binarysearch.findsmallestletter_744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1, mid = letters.length / 2;
        char res = letters[0];

        while(start <= end){
            if(letters[mid] <= target){
                start = mid + 1;
            }
            else if(letters[mid] > target){
                end = mid - 1;
                res = letters[mid];
            }

            mid = (start + end) / 2;
        }

        return res;
    }
}

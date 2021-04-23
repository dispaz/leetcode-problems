package problems.binarysearch.guess_number_374;

public class Solution {
    public int guessNumber(int n){
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            int guess = /*guess(mid)*/0;
            switch(guess){
                case -1 :
                    right = mid;
                    break;
                case 1:
                    left = mid + 1;
                    break;
                case 0:
                    return mid;
            }
        }
        return left;
    }
}

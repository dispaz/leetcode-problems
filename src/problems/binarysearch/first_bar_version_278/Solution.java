package problems.binarysearch.first_bar_version_278;

public class Solution {
    //my
    public static int firstBadVersion(int n, int bad) {
        n = n % 2 == 1 ? n / 2 + 1 : n / 2;
        int i = n;
        while(n != 1 || isBad(i - 1, bad) != isBad(i, bad)){
            n = n % 2 == 1 ? n / 2 + 1 : n / 2;
            i = isBad(i, bad) ? i - n : i + n;
        }
        return i;
    }

    //leetcode
    public static int firstBadVersionSolution(int n, int bad){
        int left = 1;
        int right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(isBad(mid, bad))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    private static boolean isBad(int x, int bad) {
        if (x >= bad) return true;
        else return false;
    }
}

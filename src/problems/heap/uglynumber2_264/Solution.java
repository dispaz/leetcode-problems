package problems.heap.uglynumber2_264;

public class Solution {
    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = Math.min(ugly[i2] * 2, Math.min(ugly[i3] * 3, ugly[i5] * 5));
            if (ugly[i2] * 2 == min) i2++;
            if (ugly[i3] * 3 == min) i3++;
            if (ugly[i5] * 5 == min) i5++;
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        nthUglyNumber(8);
    }
}

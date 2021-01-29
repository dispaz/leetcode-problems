package bitmanipulation.poweroffour_342;

public class Solution {
    public boolean isPowerOfFour(int n) {
        int map = 0b0101_0101_0101_0101_0101_0101_0101_0101;
        return n > 0 && (n & (n - 1)) == 0 && (n & map) != 0;
    }
}
package math.countoddnumbersinrange_1523;

public class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}

package problems.math.arrangingcoins_441;

public class Solution {
    public int arrangeCoins(int n) {
        int dots = 1;
        double val = 1.0;
        while(val * dots < n){
            dots++;
            val += 0.5f;
        }
        System.out.println(dots + " " + val);
        if(val * dots == n) return dots;
        else return dots - 1;
    }
}

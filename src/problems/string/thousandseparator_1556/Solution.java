package problems.string.thousandseparator_1556;

public class Solution {
    public String thousandSeparator(int n) {
        StringBuilder res = new StringBuilder(String.valueOf(n));
        int size = res.length();

        for(int i = size - 1; i > 0; i--){
            if((size - i) % 3 == 0){
                res.insert(i, ".");
            }
        }

        return res.toString();
    }
}

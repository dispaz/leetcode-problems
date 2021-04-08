package greedy.minimumchangestoalteringinbinary_1758;

public class Solution {
    public int minOperations(String s) {
        int res = 0, n = s.length();
        for (int i = 0; i < n; ++i){
            if (s.charAt(i) - '0' != i % 2)
                res++;
        }

        return Math.min(res, n - res);
    }

    public int minOperations2(String s) {
        int cnt0 = 0, cnt1 = 0;
        char ch0 = '0', ch1 = '1';
        for(char ch : s.toCharArray()){
            if(ch != ch0)
                cnt0++;
            if(ch != ch1)
                cnt1++;
            ch = ch0;
            ch0 = ch1;
            ch1 = ch;
        }
        return Math.min(cnt0, cnt1);
    }
}

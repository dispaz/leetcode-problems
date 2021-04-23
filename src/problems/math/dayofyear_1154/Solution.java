package problems.math.dayofyear_1154;

public class Solution {
    public int dayOfYear(String date) {
        int [] daysInM = new int []{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        String[] YMD = date.split("-");

        int year = Integer.parseInt(YMD[0]);
        int month = Integer.parseInt(YMD[1]);
        int days = Integer.parseInt(YMD[2]);

        int res = days + daysInM[month - 1] + (((year % 4 == 0 || year % 400 == 0) && year % 100 != 0  && month > 2) ? 1 : 0);

        return res;
    }
}

package math.string_to_int_8;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static final int INT_LENGTH = 10;

    public int myAtoi(String s) {
        boolean wasMinus = false, wasPlus = false, wasNumber = false;
        char minusCh = '-', plusCh = '+', spaceCh = ' ';
        char zero = '0', nine = '9';
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(!wasMinus && !wasPlus && !wasNumber) {
                if(ch == minusCh) {
                    wasMinus = true; continue;
                }
                else if(ch == plusCh){
                    wasPlus = true; continue;
                }
                else if(ch == spaceCh) continue;
            }
            else if((wasMinus || wasPlus || wasNumber) && ch == spaceCh)
                break;

            if(ch < zero || ch > nine){
                break;
            }
            int currentInt = ch - zero;

            if(result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && currentInt > Integer.MAX_VALUE % 10)){
                return wasMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + currentInt;
            wasNumber = true;
        }

        return wasMinus ? result * (-1) : result;
    }
}
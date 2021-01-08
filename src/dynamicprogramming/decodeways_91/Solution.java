package dynamicprogramming.decodeways_91;

public class Solution {
    public int numDecodings(String s) {
        int [] arr = new int [s.length() + 1];
        arr[0] = 1;
        arr[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i < arr.length; i++){
            if(s.charAt(i - 1) > '0' && s.charAt(i - 1) <= '9'){
                arr[i] += arr[i - 1];
            }
            int second = Integer.parseInt(s.substring(i - 2, i));
            if( second > 9 && second < 27){
                arr[i] += arr[i - 2];
            }
        }
        return arr[s.length()];
    }
}

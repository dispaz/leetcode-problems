package arrayproblems.slowestkey_1629;

public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char ch = keysPressed.charAt(0);

        for(int i = 1; i < releaseTimes.length; i++){
            int diff = releaseTimes[i] - releaseTimes[i - 1];
            if(diff > max ||
                    (max == diff && ch < keysPressed.charAt(i))){
                max = diff;
                ch = keysPressed.charAt(i);
            }
        }
        return ch;
    }
}

package problems.string.backspacestringcompare_844;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        int sBs = 0;
        int tBs = 0;
        int i = S.length() - 1;
        int j = T.length() - 1;
        while(i >= 0 || j >= 0){
            if(i >= 0 && S.charAt(i) == '#'){
                sBs++;
                i--;
                continue;
            }

            if(j >= 0 && T.charAt(j) == '#'){
                tBs++;
                j--;
                continue;
            }

            if(sBs > 0){
                sBs--;
                i--;
                continue;
            }

            if(tBs > 0){
                tBs--;
                j--;
                continue;
            }

            if( i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;

            if((i >= 0) != (j >= 0))
                return false;

            i--; j--;
        }
        return true;
    }
}

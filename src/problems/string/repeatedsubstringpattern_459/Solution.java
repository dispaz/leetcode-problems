package problems.string.repeatedsubstringpattern_459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int i = l / 2;  i > 0; i--){
            if(l % i == 0){
                int m = l / i;
                String subS = s.substring(0, i);
                int j;
                for(j = 1; j < m; j++){
                    if(!subS.equals(s.substring(i * j, i + i * j))){
                        break;
                    }
                }

                if(j == m){
                    return true;
                }
            }
        }
        return false;
    }
}

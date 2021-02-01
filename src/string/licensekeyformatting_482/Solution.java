package string.licensekeyformatting_482;

public class Solution {
    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for(int i =  S.length() - 1; i >= 0; i--){
            if(S.charAt(i) != '-'){
                sb.append(sb.length() % (K + 1) == K ? '-' : "").append(Character.toUpperCase(S.charAt(i)));
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String [] args){
        String sb = licenseKeyFormatting("--a-a-a-a--", 2);
        System.out.println(sb);
    }
}

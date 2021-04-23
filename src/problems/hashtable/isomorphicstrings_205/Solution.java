package problems.hashtable.isomorphicstrings_205;

import java.util.HashMap;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char tch = t.charAt(i), sch = s.charAt(i);
            if(map1.containsKey(sch)){
                if(!map2.containsKey(tch)) return false;
                if(sch != s.charAt(map2.get(tch))){
                    return false;
                }
            }

            if(map2.containsKey(tch))
            {
                if(!map1.containsKey(sch)) return false;
                if(tch != t.charAt(map1.get(sch))){
                    return false;
                }
            }
            map1.put(sch, i);
            map2.put(tch, i);
        }

        return true;
    }

    public static boolean isIsomorphic2(String s, String t){
        int [] ms = new int[256];
        int [] mt = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if(ms[s.charAt(i)] != mt[t.charAt(i)]) return false;
            ms[s.charAt(i)] = i + 1;
            mt[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(isIsomorphic("papar", "title"));
    }
}

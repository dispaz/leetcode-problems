package string.pathcrossing_1496;

import kotlin.Pair;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isPathCrossing(String path) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        int vert = 0, horiz = 0;
        set.add(new Pair(0,0));
        for(int i = 0; i < path.length(); i++){
            switch (path.charAt(i)){
                case 'N':
                    vert++;
                    break;
                case 'E':
                    horiz++;
                    break;
                case 'S':
                    vert--;
                    break;
                case 'W':
                    horiz--;
                    break;
            }
            Pair<Integer, Integer> pair = new Pair(horiz, vert);
            if(set.contains(pair)) return true;
            set.add(pair);
        }
        return false;
    }

    public static void main(String [] args){
        String S = "NESWW";
        System.out.println(isPathCrossing(S));
    }
}

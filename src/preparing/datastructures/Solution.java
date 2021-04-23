package preparing.datastructures;

import preparing.datastructures.hashtable.HashMap;

public class Solution {
    public static void main(String [] args){
        HashMap map = new HashMap();
        map.put(1, 10);
        map.put(2, 15);
        map.put(3, 16);
        System.out.println(map.get(3) + " size = " + map.size());
    }
}

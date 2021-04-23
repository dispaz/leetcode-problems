package preparing.datastructures;

import preparing.datastructures.hashtable.HashMap;

public class Solution {
    public static void main(String [] args){
        HashMap map = new HashMap();
        map.put(1, 10);
        map.put(2, 15);
        map.put(3, 16);
        map.put(4, 4);

        map.remove(4);
        map.remove(3);

        map.put(11, 90);
        System.out.println(map.get(11) + " size = " + map.size());
    }
}

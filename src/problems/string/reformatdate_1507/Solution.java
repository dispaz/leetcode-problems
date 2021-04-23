package problems.string.reformatdate_1507;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String reformatDate(String date) {
        StringBuilder str = new StringBuilder();
        String [] split = date.split(" ");
        str.append(split[2] + "-");
        Map<String, String> map = new HashMap();

        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        str.append(map.get(split[1]) + "-");
        str.append((split[0].length() == 3 ? "0" : "") + split[0].substring(0, split[0].length() - 2));
        return str.toString();
    }

    public static void main(String[] args){
        reformatDate("31st Jan 2020");
    }
}

package string.studentattendance_551;

public class Solution {
    public boolean checkRecord(String s) {
        return !s.matches(".*A.*A.*|.*LLL.*");
    }
}

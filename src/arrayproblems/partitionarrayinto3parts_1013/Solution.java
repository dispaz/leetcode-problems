package arrayproblems.partitionarrayinto3parts_1013;

public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for(int x : arr){
            sum += x;
        }

        if(sum % 3 != 0) {
            return false;
        }

        int ave = sum / 3, count = 0, part = 0;
        for(int x : arr){
            part += x;

            if(part == ave){
                count++;
                part = 0;
            }
        }

        return count >= 3;
    }
}

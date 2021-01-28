package arrayproblems.distancebetweenbustops_1184;

public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination){
            int temp = destination;
            destination = start;
            start = temp;
        }
        int res = 0;
        int total = 0;
        for(int i = 0; i < distance.length; i++){
            if(i >= start && i < destination){
                res += distance[i];
            }
            total += distance[i];
        }

        return Math.min(res, total - res);
    }
}

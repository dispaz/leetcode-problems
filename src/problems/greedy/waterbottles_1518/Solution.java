package problems.greedy.waterbottles_1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange){
            sum += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }
        return sum;
    }
    public int numWaterBottles2(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}
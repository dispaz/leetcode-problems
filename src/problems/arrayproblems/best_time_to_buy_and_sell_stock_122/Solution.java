package problems.arrayproblems.best_time_to_buy_and_sell_stock_122;

public class Solution {
    public int maxProfit(int[] prices) {
        int current = prices[0], profit = 0, max = 0;
        for(int i = 1;  i < prices.length; i++){
            if(prices[i] < max || prices[i] < current){
                int dayProfit = max - current;
                if(i > 1){
                    profit += dayProfit > 0 ? dayProfit : 0;
                }
                current = prices[i];
            }
            else {
                max = prices[i];
            }
        }
        return profit;
    }
}

package dynamicprogramming.buysellstock_121;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0, minStock = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minStock) {
                minStock = price;
            } else if (price - minStock > maxProfit)
                maxProfit = price - minStock;
        }
        return maxProfit;
    }
}

package arrays_and_strings;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int pricesEnd = prices.length - 1;
        int maxProfit = 0;

        while (sell <= pricesEnd) {
            int currProfit = prices[sell] - prices[buy];
            if (currProfit > 0) {
                maxProfit = Math.max(currProfit, maxProfit);
            } else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}

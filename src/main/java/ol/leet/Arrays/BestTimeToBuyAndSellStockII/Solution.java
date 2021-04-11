package ol.leet.Arrays.BestTimeToBuyAndSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int priceToBuy = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            if (priceToBuy < prices[i]) {
                result += prices[i] - priceToBuy;
                priceToBuy = prices[i];
            } else if (priceToBuy > prices[i]) {
                priceToBuy = prices[i];
            }
        }
        return result;
    }
}

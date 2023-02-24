package Sliding_Window;

public class Best_Time_To_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0, j = i + 1;

        while (j < prices.length) {
            if (prices[i] > prices[j]) {
                i = j;
                j = i + 1;
            } else {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
                j++;
            }
        }

        return maxProfit;
    }
}

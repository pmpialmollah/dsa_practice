package array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = { 6, 1, 4, 3, 5, 7 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int minimum = prices[0];
        for (int i = 1; i < len; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
            } else {
                int value = prices[i]-minimum;
                profit = value>profit? value: profit;
            }
        }
        return profit;
    }
}

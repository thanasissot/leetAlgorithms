package Easy;

public class _121 {
    public int maxProfit(int[] prices) {
        int max = 0,
            i = 0,
            j = 1;

        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                max = Math.max(prices[j] - prices[i], max);
                j++;
            }
            else {
                i = j;
                j++;
            }
        }

        return max;
    }
}

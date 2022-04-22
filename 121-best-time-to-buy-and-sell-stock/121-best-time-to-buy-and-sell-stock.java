class Solution {
    public int maxProfit(int[] prices) {
          int max = 0;
        int min = prices[0];
        int maxed = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }

            if (min < prices[i]) {
                max = prices[i] - min;
                if (maxed < max)
                    maxed = max;

            }
        }
        System.out.println(max + " " + min);
        return maxed;

    }
}
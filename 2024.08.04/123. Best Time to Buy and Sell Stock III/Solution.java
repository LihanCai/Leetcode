class Solution {
    public int maxProfit(int[] prices) {
        int firstsell = 0, finalprofit = 0, firstbuy = Integer.MAX_VALUE, secondbuy = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            firstbuy = Math.min(firstbuy, prices[i]);
            firstsell = Math.max(firstsell, prices[i] - firstbuy);
            secondbuy = Math.max(secondbuy, firstsell - prices[i]);
            finalprofit = Math.max(finalprofit, secondbuy + prices[i]);
        }
        return finalprofit;
    }
}
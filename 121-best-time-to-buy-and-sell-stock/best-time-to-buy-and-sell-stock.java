class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for(int n : prices)
        {
            cost = Math.min(cost, n);
            profit = Math.max(profit, n - cost);
        }
        return profit;
    }
}
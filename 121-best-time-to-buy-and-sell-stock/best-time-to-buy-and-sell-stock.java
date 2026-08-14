class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyvalue=Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++)
        {
            buyvalue = Math.min(buyvalue, prices[i]);
            profit = Math.max(profit, prices[i]-buyvalue);
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit = 0;

        //Brute Force
        /*for(int i= 0; i < prices.length; i++)
        {
            int buy_st = prices[i];
            for(int j= i+1; j < prices.length; j++)
            {
                int profit = prices[j] - buy_st;
                maxprofit = Math.max(profit, maxprofit);
            }
        }*/

        int minSoFar = Integer.MAX_VALUE;

        for(int i=0; i < prices.length; i++)
        {
            if(prices[i] < minSoFar)

            {
                minSoFar =  prices[i];
            }
            else
            {
                maxprofit = Math.max(maxprofit, prices[i] - minSoFar);
            }
            
        }


        return maxprofit;
        
    }
}
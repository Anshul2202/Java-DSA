// Easy

class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int sell = 0;
        int finalProfit = 0;
        int currentProfit = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < bestBuy){
                bestBuy = prices[i];
            }  

            sell = prices[i];
            currentProfit = sell - bestBuy;

            if(finalProfit < currentProfit){
                finalProfit = currentProfit;
            }

        }


        return finalProfit;
    }
}
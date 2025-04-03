public class MaximumProfit {
    public int maximumProfit(int[] prices) {
        
        int buyPrice = prices[0] , maxProfit = 0;

        for(int i = 1; i < prices.length ; i++){

            if(prices[i] > buyPrice){

                maxProfit  = Math.max(maxProfit , prices[i] - buyPrice);

            }else{
                 buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}

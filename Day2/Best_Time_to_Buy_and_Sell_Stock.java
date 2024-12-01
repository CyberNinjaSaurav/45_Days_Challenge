package 45_Days_Challenge.Day2;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
     
        int buyPrice = prices[0];
        int profit = 0;
  
        for(int i= 1; i < prices.length; i++){
          if(buyPrice > prices[i]){
              buyPrice = prices[i];
          }
          profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }  
    
}

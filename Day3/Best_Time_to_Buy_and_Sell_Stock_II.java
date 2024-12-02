package Day3;

public class Best_Time_to_Buy_and_Sell_Stock_II {


      public int maxProfit(int[] prices) {
       
        int buyPrice = prices[0];
        
   
        int profit = 0;
        
    
        for(int i = 1; i < prices.length; i++){
           
            if(prices[i - 1] > prices[i]){
               
                profit += prices[i - 1] - buyPrice;
                
               
                buyPrice = prices[i];
            }
        }
        
     
        profit += prices[prices.length - 1] - buyPrice;
        
        // Return the total profit
        return profit;
    }
}

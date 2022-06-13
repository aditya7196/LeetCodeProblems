package main.java;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int currProfit = 0;
        int maxProfitSoFar = 0;
        for(int i=1; i<prices.length; i++){
            currProfit = currProfit + prices[i]-prices[i-1];
            currProfit = Math.max(0, currProfit);
            maxProfitSoFar = Math.max(currProfit, maxProfitSoFar);

        }
        return maxProfitSoFar;
    }

    public static int maxProfitAnotherApproach(int[] prices) {
      int buyPrice = prices[0];
      int maxprofit = 0;
      for(int i=1; i<prices.length; i++){
          int profit = prices[i] - buyPrice;
          if(profit>maxprofit){
              maxprofit = profit;
          }
          if(prices[i]<buyPrice){
              buyPrice = prices[i];
          }
      }
      return maxprofit;
    }


    public static void main(String[] args) {
        int[] prices = {2,4,1};
        int profit = maxProfitAnotherApproach(prices);
  }
}

public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int maxProfit = 0;
        int buy = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]-buy>maxProfit){
                maxProfit = prices[i]-buy;
            }
            else if(prices[i]<buy){
                buy=prices[i];
            }
        }
        return maxProfit;
    }
}

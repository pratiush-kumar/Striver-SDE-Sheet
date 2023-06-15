class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            else if(prices[i]-buyPrice>maxProfit){
                maxProfit = prices[i]-buyPrice;
            }
        }
        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int r = 1;
        int l =0;
        int profit =0;
        while(r<prices.length){
            int diff = prices[r]- prices[l];
            profit = Math.max(profit,diff);
            if(diff<=0){
                l=r;
            }
            r++;
        }
        return profit;
    }
}

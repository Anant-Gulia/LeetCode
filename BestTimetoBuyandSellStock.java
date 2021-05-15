class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int temp=prices[0],ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<temp)
                temp=prices[i];
            else
                ans=Math.max(ans,prices[i]-temp);
        }
        return ans;
    }
}
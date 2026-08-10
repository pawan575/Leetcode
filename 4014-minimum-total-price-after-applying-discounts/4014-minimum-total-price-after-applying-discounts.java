class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans=0;
        int idx=discounts.length-1;
        for(int i=prices.length-1;i>=0;i--){
            if(idx>-1) ans+=prices[i]*(100-discounts[idx--])/100.0;
            else ans+=prices[i];
        }
        return ans;
    }
}
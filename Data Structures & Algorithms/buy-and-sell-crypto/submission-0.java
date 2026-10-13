class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxPft=0;

        for(int price:prices){
            minPrice= Math.min(minPrice,price);
            maxPft=Math.max(maxPft,price-minPrice);
        }
        return maxPft;
    }
}

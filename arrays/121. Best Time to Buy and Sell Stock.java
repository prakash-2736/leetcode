class Solution {
    public int maxProfit(int[] prices) {
        int m =  Integer.MAX_VALUE;
        int arr= 0;
        for (int i =0;i < prices.length;i++){
           m = Math.min(m,prices[i]);
            arr = Math.max(arr,prices[i]-m);
        }
        return arr;
    }
}

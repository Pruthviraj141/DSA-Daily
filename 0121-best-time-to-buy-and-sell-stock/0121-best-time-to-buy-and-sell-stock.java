class Solution {
    public int maxProfit(int[] p) {
        int minprice = p[0];
        int maxprof = 0;

        for(int i = 1; i<p.length;i ++){
int profit = p[i] - minprice;
minprice = Math.min(minprice , p[i]);
maxprof = Math.max(maxprof,profit);

        }
        return maxprof;
    }
}
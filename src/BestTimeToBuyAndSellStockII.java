/**
 * @see <a href="https://leetcode.com/articles/best-time-buy-and-sell-stock-ii/">思路详解</a>
 * No.122
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockII {
    /**
     * 找出峰值谷值去计算
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int i=0;
        if(prices.length==0) return 0;
        int valley=prices[0];
        int peak=prices[0];
        int result=0;
        while(i<prices.length-1){
            while(i<prices.length-1&&prices[i]>=prices[i+1])
                i++;
            valley=prices[i];
            while(i<prices.length-1&&prices[i]<=prices[i+1])
                i++;
            peak=prices[i];
            result+=peak-valley;
        }
        return result;
    }

    /**
     * 其实最大交易数目就是由涨的每天汇集而成
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices){
        int result=0;
        if(prices.length==0) return 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                result+=prices[i]-prices[i-1];
        }
        return result;
    }

    public static void main(String[] args){
        int[] prices={3,3,4,6,5,7,3,3,4,5,5};
        System.out.println(maxProfit1(prices));//should be 7
    }
}

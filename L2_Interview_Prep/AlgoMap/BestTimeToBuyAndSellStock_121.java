package L2_Interview_Prep.AlgoMap;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[]  arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    // Method --> 1
   /* public static int maxProfit(int[] prices) {
        int n=prices.length;
        int currentprofit=0;
        int maxprofit=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {

                currentprofit= prices[j]-prices[i];

                if(currentprofit > maxprofit)
                {
                    maxprofit=currentprofit;
                }
            }
        }
        return maxprofit;
    }*/

    //Method --> 2
    public static int maxProfit(int[] prices) {
        int ans = 0, mi = prices[0];
        for (int v : prices) {
            ans = Math.max(ans, v - mi);
            mi = Math.min(mi, v);
        }
        return ans;
    }
}

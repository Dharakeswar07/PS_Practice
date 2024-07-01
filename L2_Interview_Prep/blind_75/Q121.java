package L2_Interview_Prep.blind_75;

//Best Time to Buy and Sell Stock

public class Q121 {
    public static void main(String[] args) {
        int[] price={7,1,5,6,4};
        System.out.println(maxProfit(price));
    }
    public static int maxProfit(int[] prices) {
        int min=0;
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[min]>prices[i])
            {
                min=i;
            }
            else if(prices[i]-prices[min] > max)
            {
                max=prices[i]-prices[min];
            }
        }
        return max;
    }
}

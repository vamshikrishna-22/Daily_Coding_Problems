package dailyCodingPractice;
/**
 * This problem was asked by Facebook.

Given a array of numbers representing the 
stock prices of a company in chronological order, 
write a function that calculates the maximum profit 
you could have made from buying and selling that stock once.
 You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, 
since you could buy the stock at 5 dollars and sell it at 10 dollars.

 *
 */
public class BuyandSell {

	public static void main(String[] args) {
		int[] arr = new int[] {9, 11, 8, 5, 7, 10};
		System.out.println("Maximum profit is : "+maxProfit (arr));
	}
	
	public static int maxProfit(int[] prices) {
		
		int profit = 0;
        int i=0;
        int start = prices[0];
        while(i < prices.length){
            if(prices[i] > start){
                profit= Math.max(profit,prices[i] - start);
            }
            if(prices[i] < start)
                start=prices[i];
            i++;
        }
        return profit;	
	}

}

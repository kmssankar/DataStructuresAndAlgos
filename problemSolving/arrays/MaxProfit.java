package arrays;

public class MaxProfit {

    public static void main(String[] args) {
        
    }

       public int maxProfit(int[] prices) {
     
        int maxProfit = 0;
        int min = prices[0];
        for(int i : prices){
            if( i < min){
                min = i;
            }
        int profit = i - min;
           if ( profit > maxProfit){
              maxProfit = profit;
           }
        }
        return maxProfit;
    }
}

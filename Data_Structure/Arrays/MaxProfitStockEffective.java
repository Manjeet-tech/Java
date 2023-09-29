//Best Time to Buy and Sell Stock
// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Maximum Difference Problem with Order
// Input : arr = {2, 3, 10, 6, 4, 8, 1}
// Output : 8
// Explanation : The maximum difference is between 10 and 2.

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

// time complexity = O(n)

class MaxProfitStockEffective{

    public static void main(String[] args){

        int[] num = new int[]{2, 3, 10, 6, 4, 8, 1};
        maxProfit(num);
    }

    public static void maxProfit(int[] num){

        int max_profit = num[1] - num[0];  

        int min_element = num[0];  

        for(int i=1; i< num.length; i++){

            // Track the max profit
            if(max_profit < num[i] - min_element){    
                max_profit =  num[i] - min_element;   
            }

            // Track the minimum element
            if(num[i] < min_element){   
                min_element = num[i];   
            }
        }

        System.out.println(max_profit);
    }


}
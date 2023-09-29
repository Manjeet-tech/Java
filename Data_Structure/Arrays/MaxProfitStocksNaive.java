
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

// time complexity = O(n^2)

class MaxProfitStockNaive{

    public static void main(String[] args){

        int[] num = new int[]{7,6,4,3,1};
        maxProfit(num);
    }

    public static void maxProfit(int[] num){
        
        int profit = 0;

        // Boundry 1: If there is single element
        if(num.length < 1){
            profit = num[0];
        }

        profit =  num[1] - num[0];

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j < num.length; j++){

                if(profit < num[j] - num[i]){
                    profit = num[j] - num[i];
                }
                   
            }
        }

        //Boundry 2: If the profit is lesser then 0
        if(profit < 0){
            System.out.println("no profit");
        }

        System.out.println(profit);
    }


}
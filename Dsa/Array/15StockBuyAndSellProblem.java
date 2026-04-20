// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Stock Buy and Sell Problem !!!

// Our Task: The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.


 
// Examples:

// Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
// Output: 865
// Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
//                        Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
//                        Maximum Profit  = 210 + 655 = 865
// Input: arr[] = {4, 2, 2, 2, 4}
// Output: 2
// Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
//                        Maximum Profit  = 2
 

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach

// In this video, we will discuss the Naive approach.

// In the next part of the video, the Efficient Approach will be discussed.


// 1) Naive Approach
// A simple approach is to try buying the stocks and selling them every single day when profitable and keep updating the maximum profit so far.

// Follow the steps below to solve the problem:

// Try to buy every stock from start to end – 1
// After that again call the maxProfit function to calculate answer
// curr_profit = price[j] – price[i] + maxProfit(start, i – 1) + maxProfit(j + 1, end)
// profit = max(profit, curr_profit)
// Time Complexity: O(n2), Trying to buy every stock and exploring all possibilities.
// Auxiliary Space: O(1)

// Native approach to find the maximum profit that you can make by buying and selling on those days
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxProfit(int price[], int start, int end)
    {
    	if(end <= start)
    		return 0;

    	int profit = 0;

    	for(int i = start; i < end; i++)
    	{
    		for(int j = i + 1; j <= end; j++)
    		{
    			if(price[j] > price[i])
    			{
    				int curr_profit = price[j] - price[i] 
    								  + maxProfit(price, start, i - 1)
    								  + maxProfit(price, j + 1, end);

    				profit = Math.max(profit, curr_profit);
    			}
    		}
    	}

    	return profit;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 5, 3, 8, 12}, n = 5;

       System.out.println(maxProfit(arr, 0, n-1));

    } 

}
// Time Complexity: O(n2), Trying to buy every stock and exploring all possibilities.
// Auxiliary Space: O(1)



// 2) Efficient Approach
// The idea is to buy the stock on a day when the price is less than or equal to the price on the next day and sell it on a day
// when the price is greater than or equal to the price on the previous day. Below is the implementation of the above approach :
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxProfit(int price[], int n)
    {
    	int profit = 0;

    	for(int i = 1; i < n; i++)
    	{
    		if(price[i] > price[i - 1])
    			profit += price[i] - price[i -1];
    	}
    
    	return profit;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 5, 3, 8, 12}, n = 5;

       System.out.println(maxProfit(arr, n));

    } 

}
// Time Complexity: O(n), Traversing the price array only once.
// Auxiliary Space: O(1)
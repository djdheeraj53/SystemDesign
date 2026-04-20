// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Trapping Rain Water !!!

// Our Task: Given an array of N non-negative integers arr[ ] representing an elevation map where the width of each bar is 1,
// compute how much water it is able to trap after rain.

// Note: The array elements represent the height of the bars.

// Examples:
// Input: arr[]   = {3, 0, 2, 0, 4}
// Output: 7
// Explanation: Structure is like below.
// We can trap “3 units” of water between 3 and 2,
// “1 unit” on top of bar 2 and “3 units” between 2 and 4.

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach

// 1)Naive Approach 
// Complexity Analysis: 

// Time Complexity: O(n2). There are two nested loops traversing the array.
// Space Complexity: O(1). No extra space is required.


// 2) Efficient Approach 
// Complexity Analysis:

// Time Complexity: O(N). Only one traversal of the array is needed, So time Complexity is O(N).
// Space Complexity: O(N). Two extra arrays are needed, each of size N.

// Native approach to find the amount of water that can be trapped
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	for(int i = 1; i < n - 1; i++)
    	{
    		int lMax = arr[i];

    		for(int j = 0; j < i; j++)
    			lMax = Math.max(lMax, arr[j]);

    		int rMax = arr[i];

    		for(int j = i + 1; j < n; j++)
    			rMax = Math.max(rMax, arr[j]);

    		res = res + (Math.min(lMax, rMax) - arr[i]);
    	}
    
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {3, 0, 1, 2, 5}, n = 5;

      System.out.println( getWater(arr, n));

    } 

}
//  Time Complexity: O(n^2)
// Auxiliary Space: O(1)


// Optimal approach to find the amount of water that can be trapped
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	int lMax[] = new int[n];
    	int rMax[] = new int[n];

    	lMax[0] = arr[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = Math.max(arr[i], lMax[i - 1]);

    	rMax[n - 1] = arr[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = Math.max(arr[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 0, 6, 2, 3}, n = 5;

      System.out.println( getWater(arr, n));

    } 

}
// Time Complexity: O(N)
// Space Complexity: O(N)
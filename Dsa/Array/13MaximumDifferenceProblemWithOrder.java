// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Maximum Difference Problem with Order !!!

// Our Task: Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger
// element appears after the smaller number. 


 
// Examples : 

// Input : arr = {2, 3, 10, 6, 4, 8, 1}
// Output : 8
// Explanation : The maximum difference is between 10 and 2.

// Input : arr = {7, 9, 5, 6, 3, 2}
// Output : 2
// Explanation : The maximum difference is between 9 and 7.
 

// We have  2 approaches to solve the problem: Naive Approach and Efficient Approach

// 1) Naive Approach:
// We use two loops. In the outer loop, pick elements one by one and in the inner loop calculate the difference of the picked element
// with every other element in the array and compare the difference with the maximum difference calculated so far. Below is the
// implementation of the above approach : 

// Time Complexity : O(n^2) 
// Auxiliary Space : O(1)

 

// 2) Efficient Approach:
// In this method, instead of taking difference of the picked element with every other element, we take the difference with the 
// minimum element found so far. So we need to keep track of 2 things:

//  Maximum difference found so far (max_diff). 
// Minimum element visited so far (min_element).
// Time Complexity : O(n) 
// Auxiliary Space : O(1)

// Native approach to find the maximum difference between any two elements such that the larger element appears after the smaller number
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxDiff(int arr[], int n)
    {
    	int res = arr[1] - arr[0];

    	for(int i = 0; i < n - 1; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			res = Math.max(res, arr[j] - arr[i]);
    		}
    	}

    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

       System.out.println(maxDiff(arr, n));

    } 

}
// Time Complexity : O(n^2)
// Auxiliary Space : O(1)


// Optimal approach to find the maximum difference between any two elements such that the larger element appears after the smaller number
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxDiff(int arr[], int n)
    {
    	int res = arr[1] - arr[0], minVal = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    			res = Math.max(res, arr[i] - minVal);
    			
    			minVal = Math.min(minVal, arr[i]);
    	}

    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

       System.out.println(maxDiff(arr,n));

    } 

}
// Time Complexity : O(n)
// Auxiliary Space : O(1)
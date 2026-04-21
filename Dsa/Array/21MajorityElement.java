// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Majority Element !!!

// Our Task: Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// What is a majority element?
// A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// Examples : 
// Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output : 4
// Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

// Input : {3, 3, 4, 2, 4, 4, 2, 4}
// Output : No Majority Element
// Explanation: There is no element whose frequency is greater than the half of the size of the array size.

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach
// 1)Naive Approach:
// The basic solution is to have two loops and keep track of the maximum count for all different elements. If the maximum count becomes greater than n/2 then break the loops and return the element having the maximum count. If the maximum count doesn’t become more than n/2 then the majority element doesn’t exist.

// Time Complexity: O(n2), A nested loop is needed where both the loops traverse the array from start to end.
// Auxiliary Space: O(1), No extra space is required.

 
// 2) Efficient Approach (Moore’s Voting Algorithm):
// This is a two-step process:

// The first step gives the element that may be the majority element in the array. If there is a majority element in an array, then this step will definitely return majority element, otherwise, it will return candidate for majority element.
// Check if the element obtained from the above step is the majority element. This step is necessary as there might be no majority element. 
// Time Complexity: O(n), As two traversal of the array, is needed, so the time complexity is linear.
// Auxiliary Space: O(1), As no extra space is required.

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int findMajority(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		int count = 1;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] == arr[j])
    				count++;
    		}

    		if(count > n / 2)
    			return i;
    	}

    	return -1;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;

       System.out.println(findMajority(arr, n));

    } 

}
//  Output: 5
// Explanation: The majority element is 6 and its index is 5.
// Time Complexity: O(n^2) and space complexity: O(1)


// Efficient approach to find the majority element in the array
class GFG 
{ 

    static int findMajority(int arr[], int n)
    {
    	int res = 0, count = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res] == arr[i])
    			count++;
    		else 
    			count --;

    		if(count == 0)
    		{
    			res = i; count = 1;
    		}
    	}

    	count = 0;

    	for(int i = 0; i < n; i++)
    		if(arr[res] == arr[i])
    			count++;

    	if(count <= n /2)
    		res = -1;

    	return res; 
    }


    public static void main(String args[]) 
    { 
       int arr[] = {8, 8, 6, 6, 6, 4, 6}, n = 7;

       System.out.println(findMajority(arr, n));

    } 

}
// Output: 4
// Explanation: The majority element is 6 and its index is 4.
// Time Complexity: O(n) and space complexity: O(1)
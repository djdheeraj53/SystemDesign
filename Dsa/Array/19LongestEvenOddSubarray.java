// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Longest Even Odd Subarray !!!

// Our Task: Given an array a[ ] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array. 

// Examples: 
// Input: a[] = {1, 2, 3, 4, 5, 7, 9} 
// Output: 5 
// Explanation: 
// The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.

// Input: a[] = {1, 3, 5} 
// Output: 1
// Explanation: 
// There are only odd numbers, so we can count any one of them.

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach
// 1)Naive Approach 
// The idea is to consider every subarray and find the length of even and odd subarrays.

// Time Complexity: O(n2), Iterating over every subarray therefore N2 are possible
// Auxiliary Space: O(1)

 
// 2)Efficient Approach 
// By simply storing the nature of the previous element we encounter( odd or even) and comparing it with the next element.

// Time Complexity: O(n), Since we need to iterate over the whole array once
// Auxiliary Space: O(1)

// Native approach to find the length of the longest alternating even odd subarray
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxEvenOdd(int arr[], int n)
    {
    	int res = 1;

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 1;

    		for(int j = i + 1; j < n; j++)
    		{
    			if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
    			   ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
    				curr++;
    			else
    				break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

       System.out.println(maxEvenOdd(arr, n));

    } 

}
// Time Complexity: O(n^2), Iterating over every subarray therefore N2 are possible
// Auxiliary Space: O(1)

// 2)Efficient Approach
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int maxEvenOdd(int arr[], int n)
    {
    	int res = 1;
    	int curr = 1;

    	for(int i = 1; i < n; i++)
    	{
    			if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
    			   ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
    				{
    					curr++;

    					res = Math.max(res, curr);
    				}
    				else
    					curr = 1;
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

       System.out.println(maxEvenOdd(arr, n));

    } 

}
// Time Complexity: O(n), Since we need to iterate over the whole array once
// Auxiliary Space: O(1)
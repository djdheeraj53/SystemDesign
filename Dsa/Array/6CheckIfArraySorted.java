// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Check if the Array is Sorted !!!

// Our Task: We are given an array containing n elements. Our task is to check whether the array is sorted in ascending
// (non-decreasing/increasing) order or not. 

// Examples:

// Input: arr[] = {8, 12, 15} 
// Output: Yes    // Since all elements are in ascending order

// Input: arr[] = {8, 10, 10, 12} 
// Output: Yes    // Since all elements are in ascending order (elements may be repeated)

// Input: arr[] = {10, 10} 
// Output: Yes    // Equal values are considered sorted

// Input: arr[] = {100} 
// Output: Yes    // Single element is considered as sorted

// Input: arr[] = {100, 20 ,200} 
// Output: No     // Elements are not in ascending order

// Input: arr[] = {200, 100} 
// Output: No     // Since we are checking an array to be sorted in ascending order  


// We have 2 approaches to solve the problem: Naive Approach & Efficient Approach



import java.util.*;
import java.io.*;
import java.lang.*;

// Native approach to check if an array is sorted
class GFG 
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[j] < arr[i])
    				return false;
    		}
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {7, 2, 30, 10}, n = 4;

       System.out.println(isSorted(arr, n));
    } 
}

// Time Complexity: O(n^2)
// Auxiliary Space: O(1)

// Optimal Approach to check if array is sorted in ascending order
class GFG 
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 1; i < n; i++)
    	{
    	    if(arr[i] < arr[i - 1])
    	        return false;
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {5, 12, 30, 2, 35}, n = 5;

       System.out.println(isSorted(arr, n));
    } 
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)

// Optimal Approach to check if array is sorted in ascending or descending order
class GFG 
{ 
    static String checkSorted(int arr[], int n)
    {
        boolean ascending = true;
        boolean descending = true;

        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i - 1])
                ascending = false;

            if(arr[i] > arr[i - 1])
                descending = false;
        }

        if(ascending)
            return "Ascending";
        else if(descending)
            return "Descending";
        else
            return "Not Sorted";
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {5, 12, 30, 2, 35};
       int n = arr.length;

       System.out.println(checkSorted(arr, n));
    } 
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
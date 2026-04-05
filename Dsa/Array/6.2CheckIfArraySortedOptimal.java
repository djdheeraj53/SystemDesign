import java.util.*;
import java.io.*;
import java.lang.*;
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
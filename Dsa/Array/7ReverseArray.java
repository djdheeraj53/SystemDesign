// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Reverse an Array !!!

// Our Task: Given an array (or string), the task is to reverse the array.
 

// Examples : 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2} 
// Output : arr[] = {2, 1, 5, 4}

// reverse-a-number

// Time Complexity : Theta(n)

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void reverse(int arr[], int n)
    {
    	int low = 0, high = n - 1;

    	while(low < high)
    	{
    		int temp = arr[low];

    		arr[low] = arr[high];

    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 5, 7, 30}, n = 4;

       System.out.println("Before Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       reverse(arr, n);

       System.out.println("After Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Left Rotate an Array by One !!!
// Our Task: Given an array, the task is to Left Rotate an Array by One.


// What is meant by the Left Rotation of an Array by One?
// Left Rotation means a rotation that happens Counter-Clockwise (anticlockwise).
// The elements are moved counterclockwise by one, which results in the elements 
// moving back by one position from their initial position.

// Example:
// Input:  arr[] = {1,2,3,4,5}
// Output: arr[] = {2,3,4,5,1}

// Input:  arr[] = {30,5,20}
// Output: arr[] = {5,20,30}



import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void lRotateOne(int arr[], int n)
    {
    	int temp = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		arr[i - 1] = arr[i];
    	}

    	arr[n - 1] = temp;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       lRotateOne(arr, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
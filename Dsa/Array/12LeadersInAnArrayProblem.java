In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Leaders in an Array !!!

Our Task: Given an array, the task is to write a program to print all the LEADERS in the array.

What is a Leader? 
An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 


 
For example:

Input: arr[] = {16, 17, 4, 3, 5, 2}, 
Output: 17, 5, 2
 
Input: arr[] = {1, 2, 3, 4, 5, 2}, 
Output: 5, 2
We have 2 approaches to solve the problem: Naive Approach and Efficient Approach

1) Naive Approach: 
We use two loops in this approach. The outer loop runs from 0 to size – 1 and one by one picks all elements from left to right. The inner loop compares the picked element to all the elements on its right side. If the picked element is greater than all the elements to its right side, then the picked element is the leader. 

Time Complexity: O(n2)
Auxiliary Space: O(1)

 
2) Efficient Approach:
The idea is to scan all the elements from right to left in an array and keep track of the maximum till now. When the maximum changes its value, print it.

Time Complexity: O(n)
Auxiliary Space: O(1)

// Native approach to find the leaders in an array
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leaders(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		boolean flag = false;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] <= arr[j])
    			{
    				flag = true;
    				break;
    			}
    		}

    		if(flag == false)
    		{
    			System.out.print(arr[i]+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)

// Optimal approach to find the leaders in an array
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leaders(int arr[], int n)
    {
    	int curr_ldr = arr[n - 1];

    	System.out.print(curr_ldr+" ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(curr_ldr+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}
// Time Complexity: O(n)
// Auxiliary Space: O(1)


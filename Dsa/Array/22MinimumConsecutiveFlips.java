// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Minimum Consecutive Flips!!!

// Our Task: Given a binary array, we need to convert this array into an array that either contains all 1s or all 0s.  We need to do it using the minimum number of group flips. 


 
// Examples : 

// Input : arr[] = {1, 1, 0, 0, 0, 1}
// Output :  From 2 to 4
// Explanation : We have two choices, we make all 0s or do all 1s.  We need to do two group flips to make all elements 0 and one group flip to make all elements 1.  Since making all elements 1 takes the least group flips, we do this.
 

// Input : arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}
// Output :  
// From 1 to 3
// From 5 to 6
// From 8 to 8
 

// Input : arr[] = {0, 0, 0}
// Output :  
// Explanation : Output is empty, we need not to make any change
 

// Input : arr[] = {1, 1, 1}
// Output :  
// Explanation : Output is empty, we need not to make any change
 

// Input : arr[] = {0, 1}
// Output :   
// From 0 to 0  
// OR
// From 1 to 1
// Explanation :  Here number of flips are same either we make all elements as 1 or all elements as 0.
 

 

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach

// 1) Naive Approach:
// A Naive Solution is to 

// Traverse the two traversals of the array. 
// We first traverse to find the number of groups of 0s and the number of groups of 1. 
// We find the minimum of these two. 
// Then we traverse the array and flip the 1s if groups of 1s are less. Otherwise, we flip 0s.

// 2) Efficient Approach:
// The aim is to do it with one traversal of array

// An Efficient Solution is based on the below facts : 

// There are only two types of groups (groups of 0s and groups of 1s)
// Either the counts of both groups are same or the difference between counts is at most 1. For example, in {1, 1, 0, 1, 0, 0} there are two groups of 0s and two groups of 1s.  In example, {1, 1, 0, 0, 0, 1, 0, 0, 1, 1}, count of groups of 1 is one more than the counts of 0s.

// Based on the above facts, we can conclude that if we always flip the second group and other groups that of the same type as the second group, we always get the correct answer.

// Time Complexity:  O(n)
// Auxiliary Space:  O(1)


// Efficient approach to find the minimum consecutive flips
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static void printGroups(int arr[], int n)
    {
    	for(int i = 1; i < n; i++)
    	{
    		if(arr[i] != arr[i - 1])
    		{
    			if(arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
    			else
                    System.out.println(i - 1);
    		}
    	}

    	if(arr[n - 1] != arr[0])
            System.out.println(n-1);
    }


    public static void main(String args[]) 
    { 
       int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}, n = 9;

       printGroups(arr, n);

    } 

}
// Output:
// From 2 to 3
// From 6 to 7
// Explanation: We can flip the group of 1s from index 2 to 3 and from index 6 to 7 to make all elements 0.
// Time Complexity: O(n) and Auxiliary Space: O(1)
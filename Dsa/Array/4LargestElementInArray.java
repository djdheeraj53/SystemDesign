// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Largest Number in an Array !!!

// Our Task: Given an array arr[ ] of size n, the task is to find the largest element in the given array. 
 
// Example: 

// Input: arr[] = {10, 20, 4}
// Output: 20
 
// Input: arr[] = {20, 10, 20, 4, 100}
// Output: 100


// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach

// 1) Naive Method: 
// In this approach, we traverse the array for each element present in the array. We compare all elements with each other to
// find the largest element in the array.

// Time Complexity: O(n2)


// 2) Efficient Method: 
// One of the most simplest and basic approach to solve this problem is to simply traverse the whole list and find the maximum among them. 

// Follow the steps below to implement this idea:

// Create a local variable max to store the maximum among the list
// Initialize max with the first element initially, to start the comparison.
// Then traverse the given array from second element till end, and for each element:
// Compare the current element with max
// If the current element is greater than max, then replace the value of max with the current element.
// At the end, return and print the value of the largest element of array stored in max.
// Time Complexity: O(n)

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
static int getlargest(int arr[],int n)
  {
    int res = 0;
    for(int i=1;i<n;++i)
    {
        if(arr[i]>arr[res])
        {
            res = i;
        }
    }
    return res;
}
  public static void main(String[] args) throws IOException {
     int arr[]={5,8,20,15};
     System.out.println(getlargest(arr,4));
  }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)

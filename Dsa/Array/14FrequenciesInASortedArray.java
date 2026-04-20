In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Frequencies in a Sorted Array !!!

Our Task: Given a sorted array, arr[] consisting of N integers, the task is to find the frequencies of each array element.


 
Examples: 

Input: arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10} 
Output:       Frequency of 1 is: 3
              Frequency of 2 is: 1
              Frequency of 3 is: 2
              Frequency of 5 is: 2
              Frequency of 8 is: 3
              Frequency of 9 is: 2
              Frequency of 10 is: 1
Input: arr[] = {2, 2, 6, 6, 7, 7, 7, 11} 
Output:        Frequency of 2 is: 2
               Frequency of 6 is: 2
               Frequency of 7 is: 3
               Frequency of 11 is: 1
 

To solve this problem, we use the following approach:

The idea is to maintain a variable to keep track of the frequency of elements while traversing the array. Follow the steps below to solve the problem:

Initialize a variable, say freq as 1 to store the frequency of elements.
Iterate in the range [1, N-1] using the variable i and perform the following steps:
If the value of arr[i] is equal to arr[i-1], increment freq by 1.
Else print value the frequency of arr[i-1] obtained in freq and then update freq to 1.
Finally, after the above step, print the frequency of the last distinct element of the array as freq.
Time Complexity: O(N)
Auxiliary Space: O(1)

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+" "+ 1) ;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);

    } 

}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
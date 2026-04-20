// Find count of maximum consecutive 1s in a binary array. Two approaches are discussed, one is O(n^2) and other is O(n).
// Both of these approaches require O(1) auxiliary space.

//  1) Naive Approach
// In this approach, we use two loops. The outer loop picks elements one by one and the inner loop
// counts the number of consecutive 1s for every picked element. Below is the implementation
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static int maxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0;

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			if(arr[j] == 1) curr++;
    			else break;
    		}

    		res = Math.max(res, curr);
    	}
    	
    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 1, 0, 1, 1}, n = 7;

       System.out.println(maxConsecutiveOnes(arr, n));
    } 
}
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)


// 2) Efficient Approach
// In this approach, we use a single loop to count the number of consecutive 1s and keep track of the maximum count.
// Below is the implementation of the above approach :
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{
    static int maxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0, curr = 0;

    	for(int i = 0; i < n; i++)
    	{
    		if(arr[i] == 0)
    			curr = 0;
    		else
    		{
    			curr++;

    			res = Math.max(res, curr);
    		}
    	}
    	
    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 0, 1, 1, 1}, n = 7;

       System.out.println(maxConsecutiveOnes(arr, n));
    } 
}
// Time Complexity: O(n)
// Auxiliary Space: O(1)
// Naive approach to find the maximum sum of k consecutive elements in an array
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 

    static int maxSum(int arr[], int n, int k)
    {
    	int max_sum = Integer.MIN_VALUE;
    	for(int i = 0; i + k - 1 < n; i++)
    	{
    		int sum = 0;

    		for(int j = 0; j < k; j++)
    		{
    			sum += arr[i + j];
    		}

    		max_sum = Math.max(max_sum, sum);
    	}

    	return max_sum;

    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 

}
// Output: 45
// Time Complexity: O(n*k)
// Auxiliary Space: O(1)

// Efficient approach to find the maximum sum of k consecutive elements in an array
class GFG1
{ 

    static int maxSum(int arr[], int n, int k)
    {
    	int curr_sum = 0;

    	for(int i = 0; i < k; i++)
    		curr_sum += arr[i];

    	int max_sum = curr_sum;

    	for(int i = k; i < n; i++)
    	{
    		curr_sum += (arr[i] - arr[i - k]);

    		max_sum = Math.max(max_sum, curr_sum);
    	}

    	return max_sum;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 

}
// Output: 45
// Time Complexity: O(n)
// Auxiliary Space: O(1)
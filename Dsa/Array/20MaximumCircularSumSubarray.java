// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Maximum Circular Sum Subarray !!!
// Our Task: Given an array arr[] of integers, find the maximum possible sum of a subarray of the circular array.

// native approach to find the maximum circular sum subarray
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG 
{ 

	static int maxCircularSum(int arr[], int n)
		{
			int res = arr[0];

			for(int i = 0; i < n; i++)
			{
				int curr_max = arr[i];
				int curr_sum = arr[i];

				for(int j = 1; j < n; j++)
				{
					int index = (i + j) % n;

					curr_sum += arr[index];

					curr_max = Math.max(curr_max, curr_sum);
				}

				res = Math.max(res, curr_max);
			}
			return res;
		}


		public static void main(String args[]) 
		{ 
		   int arr[] = {5, -2, 3, 4}, n = 4;

		   System.out.println(maxCircularSum(arr, n));

		} 

}
// Output: 12
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)

// Efficient approach to find the maximum circular sum subarray
class GFG {
	static int normalMaxSum(int arr[], int n) {
		int res = arr[0];

		int maxEnding = arr[0];

		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);

			res = Math.max(maxEnding, res);
		}

		return res;
	}

	static int overallMaxSum(int arr[], int n) {
		int max_normal = normalMaxSum(arr, n);

		if (max_normal < 0)
			return max_normal;

		int arr_sum = 0;

		for (int i = 0; i < n; i++) {
			arr_sum += arr[i];

			arr[i] = -arr[i];
		}

		int max_circular = arr_sum + normalMaxSum(arr, n);

		return Math.max(max_circular, max_normal);
	}

	public static void main(String args[]) {
		int arr[] = { 8, -4, 3, -5, 4 }, n = 5;

		System.out.println(overallMaxSum(arr, n));

	}

}
// Output: 15
// Time Complexity: O(n)
// Auxiliary Space: O(1)
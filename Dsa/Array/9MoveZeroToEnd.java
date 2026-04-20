// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Move Zeros to End !!!

// Our Task: Given a sorted array, the task is to remove the duplicate elements from the array.

// Examples: 
// Input: arr[]  = {1, 2, 0, 0, 0, 3, 6}
// Output: 1 2 3 6 0 0 0

// Input: arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}
// Output: 1 9 8 4 2 7 6 9 0 0 0 0 0

// We have 2 approaches to solve the problem: Naive Solution and Efficient Solution



import java.io.*;

class PushZero
{
	// Function which pushes all zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n)
	{
		int count = 0;

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; // here count is
									// incremented

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < n)
			arr[count++] = 0;
	}

	/*Driver function to check for above functions*/
	public static void main (String[] args)
	{
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
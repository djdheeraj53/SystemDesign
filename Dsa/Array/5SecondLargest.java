// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Second Largest Number in an Array !!!

// Our Task: Given an array arr[ ] of size n, the task is to find the Second largest element in the given array. 
 
// Example:
// Input: arr[] = {12, 35, 1, 10, 34, 1}
// Output: The second largest element is 34.
// Explanation: The largest element of the 
// array is 35 and the second 
// largest element is 34

// Input: arr[] = {10, 5, 10}
// Output: The second largest element is 5.
// Explanation: The largest element of 
// the array is 10 and the second 
// largest element is 5

// Input: arr[] = {10, 10, 10}
// Output: The second largest does not exist.
// Explanation: Largest element of the array 
// is 10 there is no second-largest element


// We have 2 approaches to solve the problem:

// Naive approach: Finding 2nd Largest element in two traversals
// Efficient approach: Finding 2nd Largest element in one traversal

// 1) Naive Approach:
// In this approach, we find the 2nd largest element in the array, by ignoring the largest element.
// It requires two traversals of the array

// Time Complexity: O( nlogn )



// 2) Efficient Approach:
// In this approach, we find the 2nd largest element in the array, by a single traversal through the array.
// We maintain the record of the Largest and Second Largest element, which traversing through the array.

// Time Complexity: O(n)

import java.util.*;

// native approach to find the second largest element in an array
class GFG {

  // Function to print the
  // second largest elements
  static void print2largest(int arr[],
      int arr_size) {
    int i, first, second;

    // There should be
    // atleast two elements
    if (arr_size < 2) {
      System.out.printf(" Invalid Input ");
      return;
    }

    // Sort the array
    Arrays.sort(arr);

    // Start from second last element
    // as the largest element is at last
    for (i = arr_size - 2; i >= 0; i--) {
      // If the element is not
      // equal to largest element
      if (arr[i] != arr[arr_size - 1]) {
        System.out.printf("The second largest " +
            "element is %d\n", arr[i]);
        return;
      }
    }

    System.out.printf("There is no second " +
        "largest element\n");
  }

  // Driver code
  public static void main(String[] args) {
    int arr[] = { 12, 35, 1, 10, 34, 1 };
    int n = arr.length;
    print2largest(arr, n);
  }
}

// Time Complexity: O(n log n) due to sorting
// Auxiliary Space: O(1) if we ignore the space used by sorting algorithm

// Optimal Approach to find the second largest element in an array
class GFG{
 
// Function to print the second largest elements
static void print2largest(int arr[], int arr_size)
{
    int i, first, second;
 
    // There should be atleast two elements
    if (arr_size < 2)
    {
        System.out.printf(" Invalid Input ");
        return;
    }
 
    int largest = second = Integer.MIN_VALUE;
 
    // Find the largest element
    for(i = 0; i < arr_size; i++)
    {
        largest = Math.max(largest, arr[i]);
    }
 
    // Find the second largest element
    for(i = 0; i < arr_size; i++)
    {
        if (arr[i] != largest)
            second = Math.max(second, arr[i]);
    }
    if (second == Integer.MIN_VALUE)
        System.out.printf("There is no second " +
                          "largest element\n");
    else
        System.out.printf("The second largest " +
                          "element is %d\n", second);
}
 
// Driver code
public static void main(String[] args)
{
    int arr[] = { 12, 35, 1, 10, 34, 1 };
    int n = arr.length;
     
    print2largest(arr, n);
}
}

// Time Complexity: O(n)

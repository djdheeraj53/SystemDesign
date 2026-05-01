package Dsa.Searching;

// Native Java program to find the first occurrence of an element in a sorted array
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
  static int firstOccurrence(int arr[], int n, int x) {
    for (int i = 0; i < n; i++)
      if (arr[i] == x)
        return i;

    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 5, 10, 10, 15, 15 }, n = 5;

    int x = 15;

    System.out.println(firstOccurrence(arr, n, x));

  }

}
// Output: 3
// Time Complexity: O(n) and Auxiliary Space: O(1)

// Efficient approach using Binary Search iterative approach
class GFG1 {
  static int firstOcc(int arr[], int n, int x) {
    int low = 0, high = n - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (x > arr[mid])
        low = mid + 1;

      else if (x < arr[mid])
        high = mid - 1;

      else {
        if (mid == 0 || arr[mid - 1] != arr[mid])
          return mid;

        else
          high = mid - 1;
      }

    }

    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 5, 10, 10, 10, 20 }, n = 5;

    int x = 10;

    System.out.println(firstOcc(arr, n, x));
  }
}
// Output: 1
// Time Complexity: O(log n) and Auxiliary Space: O(1)

// Efficient approach using Binary Search recursive approach
class GFG2 {

  static int firstOcc(int arr[], int low, int high, int x) {
    if (low > high)
      return -1;

    int mid = (low + high) / 2;

    if (x > arr[mid])
      return firstOcc(arr, mid + 1, high, x);

    else if (x < arr[mid])
      return firstOcc(arr, low, mid - 1, x);

    else {
      if (mid == 0 || arr[mid - 1] != arr[mid])
        return mid;

      else
        return firstOcc(arr, low, mid - 1, x);
    }
  }

  public static void main(String args[]) {
    int arr[] = { 5, 10, 10, 15, 20, 20, 20 }, n = 7;

    int x = 20;

    System.out.println(firstOcc(arr, 0, n - 1, x));
  }

}
// Output: 4
// Time Complexity: O(log n) and Auxiliary Space: O(log n) due to recursive
// stack space.

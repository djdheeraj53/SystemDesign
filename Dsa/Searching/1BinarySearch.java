package Dsa.Searching;

// Binary Search iterative approach
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
  static int bSearch(int arr[], int n, int x) {
    int low = 0, high = n - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == x)
        return mid;

      else if (arr[mid] > x)
        high = mid - 1;

      else
        low = mid + 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 10, 20, 30, 40, 50, 60 }, n = 6;

    int x = 25;

    System.out.println(bSearch(arr, n, x));

  }
}
// Output: -1
// Time Complexity: O(log n) and Auxiliary Space: O(1)

// Binary Search recursive approach

class GFG1 {

  static int bSearch(int arr[], int low, int high, int x) {
    if (low > high)
      return -1;

    int mid = (low + high) / 2;

    if (arr[mid] == x)
      return mid;

    else if (arr[mid] > x)
      return bSearch(arr, low, mid - 1, x);

    else
      return bSearch(arr, mid + 1, high, x);
  }

  public static void main(String args[]) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 }, n = 7;

    int x = 20;

    System.out.println(bSearch(arr, 0, n - 1, x));
  }

}
// Output: 1
// Time Complexity: O(log n) and Auxiliary Space: O(log n) due to recursive stack space.


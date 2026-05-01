package Dsa.Searching;

// Native Java program to find the floor of square root of a number
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {

  static int sqRootFloor(int x) {
    int i = 1;

    while (i * i <= x)
      i++;

    return i - 1;
  }

  public static void main(String args[]) {

    System.out.println(sqRootFloor(15));

  }

}
// Output: 3
// Time Complexity: O(√n) and Auxiliary Space: O(1)

// Efficient approach using Binary Search
class GFG1 {

  static int sqRootFloor(int x) {
    int low = 1, high = x, ans = -1;

    while (low <= high) {
      int mid = (low + high) / 2;

      int mSq = mid * mid;

      if (mSq == x)
        return mid;
      else if (mSq > x)
        high = mid - 1;
      else {
        low = mid + 1;
        ans = mid;
      }
    }

    return ans;
  }

  public static void main(String args[]) {

    System.out.println(sqRootFloor(10));

  }

}
// Output: 3
// Time Complexity: O(log n) and Auxiliary Space: O(1)
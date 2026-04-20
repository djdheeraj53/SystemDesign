// In a realm where numbers hold secrets, a captivating challenge awaits, which is, Maximum Subarray Sum !!!

// Our Task: Given an array arr[], the task is to find the elements of a contiguous subarray of numbers that has the largest sum.

// Examples:
// Input: arr = [-2, -3, 4, -1, -2, 1, 5, -3]
// Output: [4, -1, -2, 1, 5]
// Explanation: 
// In the above input, the maximum contiguous subarray sum is 7 and the elements of the subarray are [4, -1, -2, 1, 5]

// Input: arr = [-2, -5, 6, -2, -3, 1, 5, -6] 
// Output: [6, -2, -3, 1, 5] 
// Explanation: 
// In the above input, the maximum contiguous subarray sum is 7 and the elements 
// of the subarray are [6, -2, -3, 1, 5]

// We have 2 approaches to solve the problem: Naive Approach and Efficient Approach
// 1)Naive Approach 
// The naive approach is to generate all the possible subarrays and print that subarray that has the maximum sum. 

// Time complexity: O(n2) 
// Auxiliary Space: O(1)

// 2) Efficient Approach: 
// The idea is to maintain a variable max_ending that stores the maximum sum contiguous subarray ending at
// current index and a variable res stores the maximum sum of contiguous subarray found so far. Everytime
// there is a positive-sum value in max_ending compare it with res and update res if it is greater than res.

// Time complexity: O(n) 
// Auxiliary Space: O(1)

public class GFG {
    public static int maxSum(int[] arr, int n) {
        int maxEnding = arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 4, -5, 6};
        int n = 6;

        int res = maxSum(arr, n);
        System.out.println(res);
    }
}





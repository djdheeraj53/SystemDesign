// Java program to print n-bonacci numbers using sliding window technique
class GFG { 
	
	// Function to print bonacci series 
	static void bonacciseries(int n, int m) 
	{ 
	
		// Assuming m > n. 
		int a[] = new int[m]; 
		for(int i = 0; i < m; i++) 
			a[i] = 0; 
			
		a[n - 1] = 1; 
		a[n] = 1; 
	
		// Uses sliding window 
		for (int i = n + 1; i < m; i++) 
			a[i] = 2 * a[i - 1] - a[i - n - 1]; 
	
		// Printing result 
		for (int i = 0; i < m; i++) 
			System.out.print(a[i] + " "); 
	} 
	
	// Driver's Code 
	public static void main(String args[]) 
	{ 
		int N = 5, M = 15; 
		bonacciseries(N, M); 
	} 
}
// Output: 0 0 0 0 1 1 2 4 8 16 32 64 128 256 512
// Time Complexity: O(m) and Auxiliary Space: O(m)


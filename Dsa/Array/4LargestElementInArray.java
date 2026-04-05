import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
static int getlargest(int arr[],int n)
  {
    int res = 0;
    for(int i=1;i<n;++i)
    {
        if(arr[i]>arr[res])
        {
            res = i;
        }
    }
    return res;
}
  public static void main(String[] args) throws IOException {
     int arr[]={5,8,20,15};
     System.out.println(getlargest(arr,4));
  }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)

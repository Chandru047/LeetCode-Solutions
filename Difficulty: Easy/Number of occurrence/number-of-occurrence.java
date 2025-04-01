//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution 
{
    public int countFreq(int[] arr, int target) 
    {
        int first = binarySearch(arr, target, true);
        if (first == -1) 
        {
            return 0;
        }
        int last = binarySearch(arr, target, false);
        return last - first + 1;
    }
    
    private int binarySearch(int[] arr, int target, boolean findFirst) 
    {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) 
            {
                result = mid;
                if (findFirst) 
                {
                    high = mid - 1;
                } 
                else 
                {
                    low = mid + 1;
                }
            } 
            else if (arr[mid] < target) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        
        return result;
    }
}


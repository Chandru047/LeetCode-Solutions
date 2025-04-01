//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends
class Solution 
{
    public int[] getFloorAndCeil(int x, int[] arr) 
    {
        int n = arr.length;
        int[] ans = {-1, -1};

        Arrays.sort(arr);

        int low = 0, high = n - 1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) 
            {
                ans[0] = arr[mid];  
                low = mid + 1; 
            } 
            if (arr[mid] >= x) 
            {
                ans[1] = arr[mid]; 
                high = mid - 1;  
            }
        }

        return ans;
    }
}



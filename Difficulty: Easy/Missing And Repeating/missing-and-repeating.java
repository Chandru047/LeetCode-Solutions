//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {

    public ArrayList<Integer> findTwoElement(int[] a) 
    {
        long n = a.length;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;

        for (int i = 0; i < n; i++) 
        {
            S += a[i];
            S2 += (long) a[i] * (long) a[i];
        }

        long val1 = S - SN;
        long val2 = (S2 - S2N) / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x); 
        ans.add((int) y); 

        return ans;
    }
}

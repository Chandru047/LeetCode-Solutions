//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends
class Solution {
    public static List<String> generateBinaryStrings(int n) 
    {
        List<String> result = new ArrayList<>();
        helper("", n, '0', result);
        return result;
    }

    private static void helper(String current, int n, char prev, List<String> result) {
        if (current.length() == n) 
        {
            result.add(current);
            return;
        }

        helper(current + "0", n, '0', result);

        if (prev != '1') 
        {
            helper(current + "1", n, '1', result);
        }
    }
}


//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

class Solution 
{
    static String preToInfix(String s) 
    {
          int i  = s.length() - 1 ;
          Stack<String> st = new Stack<>();
          while(i >=0)
          {
              if(Character.isLetterOrDigit(s.charAt(i)))
              {
                  st.push(s.charAt(i) + "");
              }
              else
              {
                  String t1 = st.pop();
                  String t2 = st.pop();
                  String x = "(" + t1 + s.charAt(i) + t2 + ")" ;
                  st.push(x);
              }
              i-- ;
          }
          return st.peek() ;
    }
}

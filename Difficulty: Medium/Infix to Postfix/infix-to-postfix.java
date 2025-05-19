//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution 
{
    private static int priority(char x)
       {
           switch(x)
           {
               case '+' :
                   return 1 ;
                case '-' :
                    return 1 ;
                case '*' : 
                    return 2 ;
                case '/' :
                    return 2 ;
                case'^' :
                    return 3 ;
                default :
                    return -1 ;
           }
       }
    public static String infixToPostfix(String s) 
    {
       int i = 0 ; 
       String res = "";
       Stack<Character> st = new Stack<>();
       while(i < s.length())
       {
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
               res += s.charAt(i);
           }
           else if(s.charAt(i) == '(')
           {
               st.push('(');
           }
           else if(s.charAt(i) == ')')
           {
               while(!(st.isEmpty()) && st.peek() != '(')
               {
                   
                       res+= st.peek();
                        st.pop();
                   
                   
               }
               st.pop();
           }
           else
           {
               while((!st.isEmpty()) &&priority(s.charAt(i)) <= priority(st.peek()))
               {
                   res+= st.pop();
               }
               st.push(s.charAt(i));
           }
       i++ ;
       
       }
       
       while(!(st.isEmpty()))
       {
           res+= st.pop();
       }
       return res ;
       
    }
}
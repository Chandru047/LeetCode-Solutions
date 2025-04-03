//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends

class Solution 
{
    int floorSqrt(int n) 
    {
        int low = 1 ;
        int high = n ;
        int ans = 0 ;
        while(low <= high)
        {
            int mid =( low + high ) / 2 ;
            if((mid*mid) > n)
            {
                high = mid - 1 ;
            }
            else
            {
                ans = mid;
                low = mid + 1 ;
            }
        }
        
        return ans ;
    }
}

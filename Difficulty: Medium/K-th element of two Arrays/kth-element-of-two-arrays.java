//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] a = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                a[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] b = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(a, b, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int kthElement(int[] a, int[] b, int k) {
        if (a.length > b.length) {
            return kthElement(b, a, k);
        }

        int n = a.length;
        int m = b.length;
        int left = Math.max(0, k - m);
        int right = Math.min(k, n);

        while (left <= right) {
            int cutA = left + (right - left) / 2;
            int cutB = k - cutA;

            int l1;
            if (cutA == 0) {
                l1 = Integer.MIN_VALUE;
            } else {
                l1 = a[cutA - 1];
            }

            int l2;
            if (cutB == 0) {
                l2 = Integer.MIN_VALUE;
            } else {
                l2 = b[cutB - 1];
            }

            int r1;
            if (cutA == n) {
                r1 = Integer.MAX_VALUE;
            } else {
                r1 = a[cutA];
            }

            int r2;
            if (cutB == m) {
                r2 = Integer.MAX_VALUE;
            } else {
                r2 = b[cutB];
            }

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                right = cutA - 1;
            } else {
                left = cutA + 1;
            }
        }

        return -1;
    }
}

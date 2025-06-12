class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int l = 0 ;
       int r = 0 ;
       int n = s.length ;
       int m = g.length ;
       if(n == 0)return 0 ;
       Arrays.sort(g);
       Arrays.sort(s);

       while(l < n && r < m){
        if(g[r] <= s[l])
        { 
            r++ ;
        }
        l++ ;
       }
       return r ;
    }
}
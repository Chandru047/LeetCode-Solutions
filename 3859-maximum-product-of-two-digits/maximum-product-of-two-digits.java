class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE ;
        while(n !=0){
            int x = n % 10;
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax) {
                smax = x;
            }
            n = n/ 10 ;
        }

        return max * smax;
    }
}
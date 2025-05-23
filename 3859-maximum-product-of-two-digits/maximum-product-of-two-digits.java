class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int smax = -1 ;
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
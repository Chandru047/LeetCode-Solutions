class Solution {
    public boolean isHappy(int n) {
        int sum;
        Set<Integer> seen = new HashSet<>();
        do 
        {
            if (seen.contains(n)) return false; // Cycle detected
            seen.add(n);
            sum = 0; 
            while (n > 0) 
            {
                int temp= n % 10 ;
                sum += temp * temp ;
                n /= 10;
            }
            n = sum;
        } while (n !=1);

        return true ;
        
    }
}

class Solution 
{
    final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) 
    {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPow = power(5, evenCount);
        long oddPow = power(4, oddCount);

        return (int)((evenPow * oddPow) % MOD);
    }


    private long power(long base, long exp) 
    {
        if (exp == 0) return 1; 

        long half = power(base, exp / 2);
        long result = (half * half) % MOD;

        if (exp % 2 == 1) 
        {
            result = (result * base) % MOD;
        }

        return result;
    }
}

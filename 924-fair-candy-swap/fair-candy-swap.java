class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
    {
        int[] ans = new int[2];
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        for(int i = 0 ; i < aliceSizes.length ; i++)
        {
            for(int j = 0 ; j<bobSizes.length ;j++)
            {
                int temp = bobSizes[j] ;
                int t1 = aliceSizes[i];
                bobSizes[j] = aliceSizes[i];
                aliceSizes[i] = temp;
                sum1 -= t1;
                sum1 += temp;
                sum2-= temp ;
                sum2+= t1 ;
                if(sum1 == sum2)
                {
                    ans[1] = aliceSizes[i];
                    ans[0] = bobSizes[j];
                    return ans;
                }
                else
                {
                    sum1 += t1;
                    sum1 -= temp;
                    sum2 += temp ;
                    sum2 -= t1 ;
                    int temp1 = bobSizes[j] ;
                    bobSizes[j] = aliceSizes[i];
                    aliceSizes[i] = temp1;
                    
                }
            }
        }  
        return ans; 
    }
}
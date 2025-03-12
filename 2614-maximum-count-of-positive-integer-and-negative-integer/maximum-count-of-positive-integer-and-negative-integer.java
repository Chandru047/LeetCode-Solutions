class Solution 
{
    public int maximumCount(int[] nums) 
    {
        int negative = 0 ;
        int positive = 0 ;

        for(int temp : nums)
        {
            if(temp < 0)
                negative++ ;

            if(temp > 0)
                positive++ ;
        }

        return Math.max(negative,positive);
    }
}
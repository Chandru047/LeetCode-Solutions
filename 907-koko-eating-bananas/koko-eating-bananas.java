class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        long max=Integer.MIN_VALUE;

        for(int i:piles) 
        {
            max= Math.max(max,i);
        }
            
        long low = 1, high = max;

        while(low<=high) 
        {
            long mid = (low + high)/2;

            if(canEatInTime(piles,mid,h))
            {
                high = mid-1;
            }  
            else
            {
                low = mid + 1;
            }
                
        }

        return (int)low; 
    }

    public boolean canEatInTime(int[] piles, long div, int h) {

        long hrs = 0;
        for(int i:piles) 
        {
            long d = i/div;
            hrs += d;

            if(i%div != 0) 
            {
                hrs++;
            }
                    
        }

        return hrs<=h;
    }
}
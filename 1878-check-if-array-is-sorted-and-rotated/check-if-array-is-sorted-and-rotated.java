class Solution 
{
    public boolean check(int[] nums) 
    {
        boolean dropped = false;
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) 
        {
            if (nums[i] > nums[i + 1])
             {
                if (dropped) 
                {
                    return false;
                }
                dropped = true;
            }
        }
        

        if (nums[n - 1] > nums[0] && dropped) 
        {
            return false;
        }
        
        return true;
    }
}

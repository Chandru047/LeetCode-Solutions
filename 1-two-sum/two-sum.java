class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
       int[] res = new int[2];
       int j ;
       loop:for(int i = 0 ; i  < nums.length -1 ;i++)
       {
        j = i + 1 ;
        while(j<nums.length)
        {
            if((nums[i] + nums[j]) == target)
            {
                res[0] = i;
                res[1] = j;
                break loop ;
            }
            j++ ;
        }
            
       }
       return res ;
    }
}
import java.util.HashMap ;
class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int preSum = 0 ; 
        int count = 0 ; 
        int n = nums.length ;
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0 ; i < n ; i ++)
        {
            preSum += nums[i] ;
            int remove = preSum - k ;
            if(map.containsKey(remove))
            {
                count += map.get(remove);
            }

            if(map.containsKey(preSum))
            {
                map.put(preSum , map.get(preSum) + 1);
            }
            else
            {
                map.put(preSum , 1);
            }
        }

        return count ;
    }
}
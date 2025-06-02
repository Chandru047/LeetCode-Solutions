class Solution {
    void merge(int[] nums , int low ,int mid , int high)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = low ;
        int j = mid + 1 ;
        while(i <=mid && j<=high)
        {
            if(nums[i] < nums[j])
            {
                arr.add(nums[i]);
                i++ ;
            }
            else
            {
                arr.add(nums[j]);
                j++ ;
            }
        }
        while(i<=mid)
        {
            arr.add(nums[i]);
            i++ ;
        }
        while(j<=high)
        {
            arr.add(nums[j]);
            j++ ;
        }

        for(int x = low ; x <=high ; x++)
        {
            nums[x] = arr.get(x - low);
        }
    }
    void qs(int[] nums , int low , int high)
    {
        if(low >= high) return ;
        int mid = low + (high - low) / 2 ;
        qs(nums , low , mid);
        qs(nums , mid + 1 , high);
        merge(nums , low , mid , high);
    }
    public int[] sortArray(int[] nums) 
    {
        qs(nums , 0 , nums.length - 1);   
        return nums;
    }
}
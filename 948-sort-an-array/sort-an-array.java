class Solution {
    int partition(int[] nums , int low , int high) {

    int pivotIndex = low + (int)(Math.random() * (high - low + 1));
    

    int temp = nums[low];
    nums[low] = nums[pivotIndex];
    nums[pivotIndex] = temp;
    
    int pivot = nums[low];
    int i = low;
    int j = high;

    while(i < j) {
        while(i <= high - 1 && nums[i] <= pivot) i++;
        while(j >= low + 1 && nums[j] > pivot) j--;
        if(i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    temp = nums[low];
    nums[low] = nums[j];
    nums[j] = temp;

    return j;
}

    void qs(int[] nums , int low , int high)
    {
        if(low<high)
        {
            int pIndex = partition(nums , low , high);
            qs(nums , low , pIndex - 1);
            qs(nums , pIndex + 1 , high);
        }
    }
    public int[] sortArray(int[] nums) {
        qs(nums , 0 , nums.length - 1);
        return nums ;
    }
}
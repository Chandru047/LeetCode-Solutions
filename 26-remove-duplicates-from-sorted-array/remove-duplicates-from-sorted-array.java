class Solution {
    public int removeDuplicates(int[] nums){
        if(nums.length <= 1)return 1 ;
        int l = 1 ;
        int r = 1 ;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++ ;
                r++ ;
            }
            else{
                r++ ;
            }
        }
        return l ;
    }
}
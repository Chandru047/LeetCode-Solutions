class Solution {
    public int differenceOfSum(int[] nums) {
        int elSum = 0 ;
        int dSum = 0 ;
        for(int temp : nums){
            elSum+= temp ;
        }

        for(int temp : nums){
            while(temp != 0){
                dSum+= temp %10 ;
                temp/=10;
            }
        }
        return Math.abs(elSum - dSum);
    }
}
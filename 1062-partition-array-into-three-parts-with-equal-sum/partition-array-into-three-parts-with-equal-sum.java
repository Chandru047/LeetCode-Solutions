class Solution {
    public boolean canThreePartsEqualSum(int[] arr) 
    {
        int sum = 0 ;
        
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
         if (sum % 3 != 0) return false;
        int avg = sum/3 ;

        int count = 0 ;
        int tempSum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            tempSum +=arr[i] ;
            if(tempSum == avg)
            {
                count++ ;
                tempSum = 0;
            }
            if (count == 2 && i < arr.length - 1) {
            return true;
            }
        }

        return count == 3 ;
    }
}
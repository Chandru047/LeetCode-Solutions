class Solution {
    int maxSubarraySum(int[] arr) {
        int sum = 0 ;
        int max = Integer.MIN_VALUE ;
        if(arr.length == 1) return arr[0];
        for(int temp : arr){
            sum+= temp ;
            max = Math.max(max , sum);
            if(sum < 0) sum = 0 ;
        }
        return max ;
    }
}

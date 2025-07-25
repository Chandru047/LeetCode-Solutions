class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int temp : nums){
            set.add(temp);
        }

        int max = Integer.MIN_VALUE ; 
        int sum = 0 ;
        for(int temp : set){
            max = Math.max(max , temp);
        }
        if(max < 0) return max ; 
        else{
            for (int temp : set) {
                if (temp > 0) sum += temp;
            }
        }
        return sum ;
    }
}
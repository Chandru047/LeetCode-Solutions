class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int temp : nums){
            set.add(temp);
        }
        for(int temp : nums){
            if(set.contains(original)){
                original*=2 ;
            }
        }
        return original;
    }
}
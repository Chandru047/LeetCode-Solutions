class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0 ;
        for(int temp : hours)
        {
            if(temp >=target) count++ ;
        }
        return count ;
    }
}
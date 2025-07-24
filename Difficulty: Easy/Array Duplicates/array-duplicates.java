class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int temp : arr){
            if(set.contains(temp)) res.add(temp);
            else set.add(temp);
        }
        return res ;
        
    }
}
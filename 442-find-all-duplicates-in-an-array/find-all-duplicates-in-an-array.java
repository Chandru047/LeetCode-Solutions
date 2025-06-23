class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int temp : nums){
            if(map.containsKey(temp)){
                map.put(temp , map.get(temp)+1);
            }
            else{
                map.put(temp , 1);
            }
        }

        for(int temp : map.keySet()){
            if(map.get(temp) > 1){
                arr.add(temp);
            }
        }
        return arr ;
    }
}
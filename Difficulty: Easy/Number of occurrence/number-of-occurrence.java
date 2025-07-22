class Solution {
    int countFreq(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int temp : arr){
            if(map.containsKey(temp)) map.put(temp , map.get(temp)+1);
            else map.put(temp , 1) ;
        }
        if(map.containsKey(target)) return map.get(target);
        else return 0 ; 
    }
}

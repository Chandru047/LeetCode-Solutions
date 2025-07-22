class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int temp : arr){
            if(map.containsKey(temp)) map.put(temp , map.get(temp)+1);
            else map.put(temp , 1) ;
        }
        
        for(int i = 1 ; i <= arr.length ; i++){
            if(map.containsKey(i)) list.add(map.get(i)) ;
            else list.add(0);
        }
        return list ;
    }
}

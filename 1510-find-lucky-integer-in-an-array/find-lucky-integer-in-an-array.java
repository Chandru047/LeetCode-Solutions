class Solution {
    public int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int temp : arr) {
        map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        for(int temp : map.keySet()){
            if(temp == map.get(temp)) {
                max = Math.max(max, temp);
            }
        } 
        if(max != Integer.MIN_VALUE) return max ;
        return -1 ;
    }
}
class Solution {
    public int mostWordsFound(String[] s) {
        int max = Integer.MIN_VALUE ;
        for(String temp : s){
            String[] arr = temp.split(" ");
            max = Math.max(max , arr.length);
        }
        return max ;
    }
}
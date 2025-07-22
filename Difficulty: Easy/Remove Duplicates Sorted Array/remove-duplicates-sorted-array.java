class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int temp : arr) set.add(temp);
        ArrayList<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res ;
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex += 1 ;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        long sum = 1 ;
        for(int i = 1 ; i<rowIndex ; i++)
        {
            sum = sum*(rowIndex - i);
            sum = sum/i ;
            arr.add((int)sum);
        }
        return arr;
    }
}
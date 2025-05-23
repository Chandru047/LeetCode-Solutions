class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        int count = 1 ; 
        String res = "";
        for(String temp : arr)
        {
            if(count == k) 
            {
                res+=temp;
                break ;
            }
            res+=temp + " ";
            count++;
        }
        return res ;
    }
}
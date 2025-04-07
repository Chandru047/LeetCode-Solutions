class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.split(" ");
        int n = arr.length ;
        String res ="";
        for(int i = n - 1 ; i>= 0; i--)
        {
            if(arr[i].equals("")) continue;

            res+= arr[i].trim() + " ";

        }

        return res.trim() ;
    }
}
class Solution {
    public String sortSentence(String s) 
    {
        String[] arr = s.split(" ");
        HashSet<String> set = new HashSet<>();
        String res ="";
        for(String temp : arr)
        {
            set.add(temp);
        }    
        for(int i = 0 ; i <= 9 ;i++)
        {
            for(String temp : set)
            {
                if(temp.contains(i+"")) res += temp.substring(0, temp.length() - 1) + " ";

            }
        }
        return res.trim();

    }
}
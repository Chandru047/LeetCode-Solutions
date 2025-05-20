class Solution {
    public boolean isAcronym(List<String> words, String s) 
    {
        String res = "" ; 
        for(String temp : words)
        {
            res += temp.charAt(0);
        }
        return res.equals(s) ;
    }
}
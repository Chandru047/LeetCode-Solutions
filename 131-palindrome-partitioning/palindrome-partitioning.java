class Solution 
{
    public List<List<String>> partition(String s) 
    {
            List<List<String>> ans = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            process(0 , s , ans , temp);
            return ans ;
    }

    void process(int index , String s , List<List<String>> ans , List<String> temp)
    {
        if(index == s.length())
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = index ; i < s.length() ; ++i)
        {
            if(palindrome(s , index , i))
            {
                temp.add(s.substring(index ,i+1));
                process(i+1 , s , ans , temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean palindrome(String s , int start , int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++) != s.charAt(end--))
            {
                return false ;
            }
           
        }
         return true ;
    }
}
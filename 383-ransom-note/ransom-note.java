class Solution {
    public boolean canConstruct(String s, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i) , map.get(magazine.charAt(i))+1);
            }
            else
            {
                map.put(magazine.charAt(i) , 1) ;
            }
        }

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i)) == 0) 
                {
                    return false ;
                }
                map.put(s.charAt(i) , map.get(s.charAt(i))-1);
                

            }
            else
            {
                return false;
            }
            
            
        }
        return true ;
    }
}
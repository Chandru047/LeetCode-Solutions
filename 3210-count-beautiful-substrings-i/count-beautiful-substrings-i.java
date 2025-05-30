class Solution {
    public int beautifulSubstrings(String s, int k) 
    {
        int count = 0 ; 
        for(int i = 0 ; i < s.length() ; i++)
        {
            int vowels = 0 ; 
            int consonants = 0 ;
            for(int j = i ; j < s.length() ; j++)
            {
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' )
                {
                    vowels++ ;
                }
                else
                {
                    consonants++;
                }
                if(vowels == consonants && ((vowels * consonants) % k) == 0)
            {
                count += 1;
            }
            }

            
        }   
        return count ;
    }
}
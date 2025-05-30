class Solution {
    public int beautifulSubstrings(String s, int k) 
    {
        int count = 0 ; 
        int size = s.length() ;
        for(int i = 0 ; i < size ; i++)
        {
            int vowels = 0 ; 
            int consonants = 0 ;
            for(int j = i ; j < size ; j++)
            {
                char x = s.charAt(j) ;
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' )
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
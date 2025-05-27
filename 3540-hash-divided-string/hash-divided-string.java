class Solution {
    public String stringHash(String s, int k) {
        int sum = 0 ;
        int count = 0 ; 
        String result ="";
        for(int i = 0 ; i < s.length() ; i++)
        {
            char temp = s.charAt(i);
            sum+=(temp -'a');
            count++ ;
            if(count == k)
            {
                char n  = 'a';
                n+=sum%26;
                result+=(n);
                count = 0 ;
                sum = 0 ;
            }
        }
    
        return result;

    }
}
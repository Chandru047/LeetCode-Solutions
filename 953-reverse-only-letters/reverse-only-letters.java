class Solution {
    public String reverseOnlyLetters(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        int i = 0 ; 
        int j = s.length() -1;
        while(i <= j)
        {
            if(!(Character.isLetter(s.charAt(i))))
            {
                i++ ;
                continue;
            }
            if(!(Character.isLetter(s.charAt(j))))
            {
                j-- ;
                continue;
            }

            char temp = s.charAt(i);
            sb.setCharAt(i , s.charAt(j));
            sb.setCharAt(j , temp); 
            i++ ;
            j-- ;
        }
        return sb.toString();
    }
}
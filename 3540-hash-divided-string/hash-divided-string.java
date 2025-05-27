class Solution {
    public String stringHash(String s, int k) {
        int sum = 0 ;
        int count = 0 ; 
        String result ="";
        String x = "";
        for(char temp : s.toCharArray())
        {
            x+=temp;
            sum+=(temp -'a');
            count++ ;
            if(count == k)
            {
                char i  = 'a';
                i+=sum%26;
                result+=(i);
                x="";
                count = 0 ;
                sum = 0 ;
            }
        }
    
        return result;

    }
}
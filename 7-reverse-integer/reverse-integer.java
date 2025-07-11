class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0)
        {
            isNegative = true ;
        }
        String str = Integer.toString(Math.abs(x));
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        
        try 
        {
            int reversed = Integer.parseInt(reversedStr);
            if (isNegative) 
            {
                reversed = -reversed;
            }
            
            return reversed;
        } 
        catch (NumberFormatException e) 
        {
            return 0;
        }
    }
}
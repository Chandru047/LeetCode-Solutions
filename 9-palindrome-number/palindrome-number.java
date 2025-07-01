class Solution {
    public boolean isPalindrome(int x)
    {
        String s = Integer.toString(x);
        String res = new StringBuilder(s).reverse().toString();
        if(s.equals(res))
        {
            return true;
        }
        return false;
    }
}
class Solution {
    public int longestPalindrome(String s) {
         HashSet<Character> set = new HashSet<>();
         int length = 0 ;
         for(char temp : s.toCharArray())
         {
            if(set.contains(temp))
            {
                set.remove(temp);
                length+=2;
            }
            else
            {
                set.add(temp);
            }
         }

         if(!set.isEmpty()) length+= 1;
         return length ;
    }
}
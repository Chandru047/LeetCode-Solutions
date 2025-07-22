class Solution {
    boolean isPalindrome(String s) {
       int i = 0 ; 
       int j = s.length() -1;
       while(i<=j){
           if(s.charAt(i) == s.charAt(j)) 
           {
               i++ ;
               j-- ;
               continue ;
               
           }
               
           return false ;
       }
        return true ;
    }
}
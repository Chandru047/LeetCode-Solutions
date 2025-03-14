class Solution {
    public String longestCommonPrefix(String[] s) 
    {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) 
        {
            if (first.charAt(i) != last.charAt(i)) 
            {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
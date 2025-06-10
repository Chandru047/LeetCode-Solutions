class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxLen = 0, maxFreq = 0;
        int[] lettersHash = new int[26];

        for (int right = 0; right < s.length(); right++) 
        {
            char rightChar = s.charAt(right);
            lettersHash[rightChar - 'A']++;
            maxFreq = Math.max(maxFreq, lettersHash[rightChar - 'A']);

           
            if ((right - left + 1) - maxFreq > k) 
            {
                lettersHash[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, (right - left + 1)); 
        }

        return maxLen;
    }
}

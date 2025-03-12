class Solution 
{
     private String generateWord(String word, int k) 
     {
        if (word.length() >= k) 
        {
            return word;
        }
        
        StringBuilder newWord = new StringBuilder();
        for (char c : word.toCharArray()) 
        {
            newWord.append((char) (c + 1)); 
        }
        
        return generateWord(word + newWord.toString(), k);
    }

    public char kthCharacter(int k) 
    {
        return generateWord("a", k).charAt(k - 1);
    }
}
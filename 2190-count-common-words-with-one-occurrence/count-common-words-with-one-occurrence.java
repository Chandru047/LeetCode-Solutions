class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        int count = 0 ; 
        for(int i = 0 ; i < words1.length ; i++)
        {
            if(map.containsKey(words1[i]))
            {
                map.put(words1[i],map.get(words1[i])+1);
            }
            else
            {
                map.put(words1[i],1);
            }
        }

        for(int i = 0 ; i < words2.length ; i++)
        {
            if(map1.containsKey(words2[i]))
            {
                map1.put(words2[i],map1.get(words2[i])+1);
            }
            else
            {
                map1.put(words2[i],1);
            }
        }

        for(int i = 0 ; i<words2.length;i++)
        {
            if(map.containsKey(words2[i]))
            {
                if(map.get(words2[i]) == 1 && map1.get(words2[i])==1)
                {
                    count++;
                }
            }
            else
            {
                continue;
            }
        }
        return count ;
    }
}
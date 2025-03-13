class Solution 
{
    public int romanToInt(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();

        List<Character> keys = Arrays.asList('I', 'V', 'X' , 'L' , 'C' , 'D' , 'M');
        List<Integer> values = Arrays.asList(1, 5, 10 , 50 , 100 , 500 , 1000);

        for (int i = 0; i < keys.size(); i++) 
        {
         map.put(keys.get(i), values.get(i));
        }

        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int curr = map.get(s.charAt(i));

            if (curr < prev) 
            {
                sum -= curr;
            } 
            else 
            {
                sum += curr;
            }

            prev = curr;
        }

        return sum;
    }
}
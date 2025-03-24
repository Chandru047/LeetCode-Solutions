class Solution 
{
    public static void nextPermutation(int[] nums) 
    {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) 
        {
            numList.add(num);
        }

        int n = numList.size();
        int i = n - 2;

        
        while (i >= 0 && numList.get(i) >= numList.get(i + 1)) 
        {
            i--;
        }

        
        if (i >= 0) 
        {
            int j = n - 1;
            while (numList.get(j) <= numList.get(i)) 
            {
                j--;
            }
            Collections.swap(numList, i, j);
        }
        Collections.reverse(numList.subList(i + 1, n));

        for (int k = 0; k < n; k++) {
            nums[k] = numList.get(k);
        }
    }
}

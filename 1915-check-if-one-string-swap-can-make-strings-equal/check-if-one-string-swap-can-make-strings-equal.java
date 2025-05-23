class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) 
        {
            return true;
        }    

        char[] arr = s1.toCharArray();
        int n = s1.length();

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                swap(arr, i, j);
                if (new String(arr).equals(s2)) 
                {
                    return true;
                }
                swap(arr, i, j);
            }
        }

        return false;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

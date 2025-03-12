import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) 
    {
        StringBuilder sb = new StringBuilder();
        for (int temp : digits) 
        {
            sb.append(temp);
        }

        BigInteger val = new BigInteger(sb.toString());
        val = val.add(BigInteger.ONE);

        String s = val.toString();
        char carr[] = s.toCharArray();
        int arr[] = new int[carr.length];
        int i = 0;
        for (char temp : carr) 
        {
            arr[i] = temp - '0';
            i++;
        }
        return arr;
    }
}

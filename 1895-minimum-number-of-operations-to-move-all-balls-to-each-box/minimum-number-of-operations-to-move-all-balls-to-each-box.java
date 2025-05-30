class Solution {
    public int[] minOperations(String boxes) {
        int length = boxes.length();
        int[] res = new int[length];
        
        for (int i = 0; i < length; i++) {
            int num = 0;
            for (int j = 0; j < length; j++) {
                if (boxes.charAt(j) == '1') {
                    num += Math.abs(i - j);
                }
            }
            res[i] = num;
        }
        
        return res;
    }
}

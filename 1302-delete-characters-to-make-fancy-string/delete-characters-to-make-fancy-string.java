class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        res.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 0; 
            }

            if (count < 2) {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}

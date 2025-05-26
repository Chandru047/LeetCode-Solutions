class Solution {
    public String thousandSeparator(int n) {
        String t = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = t.length() - 1; i >= 0; i--) {
            sb.append(t.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                sb.append('.');
            }
        }

        return sb.reverse().toString();
    }
}

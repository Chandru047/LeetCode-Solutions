class Solution {
    public boolean isValid(String s) {
        String[] arr = s.split("\\.");
        if (arr.length != 4) return false;

        for (String temp : arr) {
            if (temp.length() == 0 || !temp.matches("\\d+")) return false;

            if (temp.length() > 1 && temp.charAt(0) == '0') return false;

            int num = Integer.parseInt(temp);
            if (num < 0 || num > 255) return false;
        }

        return true;
    }
}

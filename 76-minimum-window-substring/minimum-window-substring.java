class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int start = 0, matched = 0;
        int minLen = Integer.MAX_VALUE, minStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            if (charCount.containsKey(endChar)) {
                charCount.put(endChar, charCount.get(endChar) - 1);
                if (charCount.get(endChar) >= 0) matched++;
            }

            while (matched == t.length()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                if (charCount.containsKey(startChar)) {
                    if (charCount.get(startChar) == 0) matched--;
                    charCount.put(startChar, charCount.get(startChar) + 1);
                }
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart, minStart + minLen);
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return canBreak(s, dict, 0, memo);
    }

    private boolean canBreak(String s, Set<String> dict, int start, Boolean[] memo) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (dict.contains(s.substring(start, end)) && canBreak(s, dict, end, memo)) {
                memo[start] = true;
                return true;
            }
        }

        memo[start] = false;
        return false;
    }
}
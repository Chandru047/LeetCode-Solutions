class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", num, target, 0, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String path, String num, int target, int index, long eval, long prevNum) {
        if (index == num.length()) {
            if (eval == target) result.add(path);
            return;
        }

        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;
            String currStr = num.substring(index, i + 1);
            long curr = Long.parseLong(currStr);

            if (index == 0) {
                backtrack(result, currStr, num, target, i + 1, curr, curr);
            } else {
                backtrack(result, path + "+" + currStr, num, target, i + 1, eval + curr, curr);
                backtrack(result, path + "-" + currStr, num, target, i + 1, eval - curr, -curr);
                backtrack(result, path + "*" + currStr, num, target, i + 1, eval - prevNum + prevNum * curr, prevNum * curr);
            }
        }
    }
}

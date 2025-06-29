class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, maxFruits = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }

            maxFruits = Math.max(maxFruits, r - l + 1);
        }

        return maxFruits;
    }
}

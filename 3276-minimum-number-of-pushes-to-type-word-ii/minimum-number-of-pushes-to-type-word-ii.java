class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Integer> freqList = new ArrayList<>(freqMap.values());
        Collections.sort(freqList, Collections.reverseOrder());
        int totalPresses = 0;
        for (int i = 0; i < freqList.size(); i++) {
            int group = i / 8 + 1; 
            totalPresses += freqList.get(i) * group;
        }
        return totalPresses;
    }
}

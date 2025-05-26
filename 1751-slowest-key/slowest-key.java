class Solution {
    public char slowestKey(int[] releaseTimes, String x) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] keysPressed = x.toCharArray();

        // Store max duration per key
        map.put(keysPressed[0], releaseTimes[0]);

        for (int i = 1; i < keysPressed.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char key = keysPressed[i];

            if (map.containsKey(key)) {
                map.put(key, Math.max(map.get(key), duration));
            } else {
                map.put(key, duration);
            }
        }

        int max = Integer.MIN_VALUE;
        char res = 'a';
        for (char key : map.keySet()) {
            int duration = map.get(key);
            if (duration > max || (duration == max && key > res)) {
                max = duration;
                res = key;
            }
        }

        return res;
    }
}

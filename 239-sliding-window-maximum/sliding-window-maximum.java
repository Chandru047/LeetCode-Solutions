class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int x = 0; x < nums.length; x++) {
            int num = nums[x];

            while (!deque.isEmpty() && deque.getLast() < num) {
                deque.pollLast();
            }
            deque.addLast(num);

            if (x >= k && nums[x - k] == deque.getFirst()) {
                deque.pollFirst();
            }

            if (x >= k - 1) {
                res.add(deque.getFirst());
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}

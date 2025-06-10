class Solution {
    public int subArr(int[] nums, int k) {
        int count = 0, l = 0, oddCount = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) oddCount++;
            while (l <= r && oddCount > k) {
                if (nums[l] % 2 == 1) oddCount--;
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return subArr(nums, k) - subArr(nums, k - 1);
    }
}
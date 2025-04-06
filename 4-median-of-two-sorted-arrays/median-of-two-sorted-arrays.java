class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int left = 0;
        int right = n1;

        while (left <= right) {
            int cut1 = left + (right - left) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1;
            if (cut1 == 0) {
                l1 = Integer.MIN_VALUE;
            } else {
                l1 = nums1[cut1 - 1];
            }

            int l2;
            if (cut2 == 0) {
                l2 = Integer.MIN_VALUE;
            } else {
                l2 = nums2[cut2 - 1];
            }

            int r1;
            if (cut1 == n1) {
                r1 = Integer.MAX_VALUE;
            } else {
                r1 = nums1[cut1];
            }

            int r2;
            if (cut2 == n2) {
                r2 = Integer.MAX_VALUE;
            } else {
                r2 = nums2[cut2];
            }

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }

        return 0.0;
    }
}

class Solution {
    public long subArrayRanges(int[] arr) {
        return sumOfMax(arr) - sumOfMin(arr);
    }

    private long sumOfMin(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] > arr[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                sum += (long) arr[mid] * (mid - left) * (right - mid);
            }
            stack.push(i);
        }
        return sum;
    }

    private long sumOfMax(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] < arr[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                sum += (long) arr[mid] * (mid - left) * (right - mid);
            }
            stack.push(i);
        }
        return sum;
    }
}

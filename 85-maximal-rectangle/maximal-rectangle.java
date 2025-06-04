import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int[] height = new int[matrix[0].length];

        for (char[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] == '1') {
                    height[j] = height[j] + 1;
                } else {
                    height[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int[] newHeights = new int[heights.length + 1]; // Add sentinel
        for (int i = 0; i < heights.length; i++) {
            newHeights[i] = heights[i];
        }

        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int h = newHeights[stack.pop()];
                int w;
                if (stack.isEmpty()) {
                    w = i;
                } else {
                    w = i - stack.peek() - 1;
                }
                max = Math.max(max, h * w);
            }
            stack.push(i);
        }
        return max;
    }
}

class Solution {
    int height(Node node) {
        if (node == null) return -1; 
        int left = height(node.left);
        int right = height(node.right);
        return 1 + Math.max(left, right);
    }
}

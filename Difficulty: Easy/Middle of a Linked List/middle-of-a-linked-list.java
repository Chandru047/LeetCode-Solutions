class Solution {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Move slow by 1, fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data; // Slow will be at the middle
    }
}


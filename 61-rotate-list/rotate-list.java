/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int cnt = 1;
        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        k = k % cnt;
        if(k == 0) return head;
        //reach just behind the kth node from last.
        ListNode slow = head, fast = head;
        while(k > 0){
            fast = fast.next;
            k--;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode rightSide = slow.next;
        slow.next = null;
        fast.next = head;
        return rightSide;
    }
}
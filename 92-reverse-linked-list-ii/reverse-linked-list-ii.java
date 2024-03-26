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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        temp.next = head;
        int count = 1;
        while (count < left) {
            prev = prev.next;
            count++;
        }

        ListNode curr = prev.next;
        while (count < right) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            count++;
        }

        return temp.next;
    }
}
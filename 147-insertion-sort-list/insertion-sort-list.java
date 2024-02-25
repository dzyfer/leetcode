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
    public ListNode insertionSortList(ListNode head) {
        ListNode h = head; 
        ListNode current = head.next;
        h.next = null;
        while (current != null) {
            ListNode temp = current;
            ListNode temp2 = null;
            ListNode headtemp = h;
            current = current.next;
            while (headtemp != null && headtemp.val < temp.val) {
                temp2 = headtemp;
                headtemp = headtemp.next;
            }
            if (temp2 != null) 
                temp2.next = temp;
            else 
                h = temp;
            temp.next = headtemp;
        }
        return h;
    }
}
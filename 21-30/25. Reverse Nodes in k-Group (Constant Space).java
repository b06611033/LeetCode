//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
//Memory Usage: 45.3 MB, less than 62.48% of Java online submissions for Reverse Nodes in k-Group.
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode answer = new ListNode();
        ListNode begin = new ListNode();
        begin.next = head;
        answer = begin;
        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
            if (count == k) {
                begin = reverse(begin, head.next);
                head = begin;
                count = 0;
            }
        }
        return answer.next;
    }
    private ListNode reverse (ListNode begin, ListNode end) {
        ListNode previous = begin;
        ListNode current = begin.next;
        ListNode next = new ListNode();
        while (current != end) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        begin.next.next = current;
        ListNode newBegin = begin.next;
        begin.next = previous;
        return newBegin;
    }
}

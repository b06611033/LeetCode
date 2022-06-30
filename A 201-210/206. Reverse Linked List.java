//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 42.9 MB, less than 49.99% of Java online submissions for Reverse Linked List.
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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode answer = new ListNode();
        ListNode last = new ListNode();
        boolean first = true;
        ListNode next = new ListNode();
        while (head != null) {
            if (head.next != null) next = head.next;
            else {
                answer = head;
                next = null;
            } 
            if (first) {
                head.next = null;
                first = false;
            } 
            else head.next = last;
            last = head;
            head = next;
        }
        return answer;
    }
}

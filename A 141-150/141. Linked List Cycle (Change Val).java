//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
//Memory Usage: 45.7 MB, less than 57.96% of Java online submissions for Linked List Cycle.
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        while (head != null) {
            if (head.val == 100001) return true;
            head.val = 100001;
            head = head.next;
        }
        return false;
    }
}

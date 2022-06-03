//Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
//Memory Usage: 39.8 MB, less than 91.55% of Java online submissions for Swap Nodes in Pairs.
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
    public ListNode swapPairs(ListNode head) {
        ListNode answer1 = new ListNode();
        ListNode answer2 = new ListNode();
        if (head == null) return null;
        ListNode previous = new ListNode();
        boolean largerThanOne = false;
        answer1 = head.next;
        answer2 = head;
        while (head != null && head.next != null) {
            swap(head, head.next, previous);
            previous = head;
            head = head.next;
            largerThanOne = true;
        }
        if (!largerThanOne) return answer2;
        return answer1;
    }
    private void swap (ListNode n1, ListNode n2, ListNode previousNode) {
        ListNode temp = new ListNode();
        temp = n2.next;
        n2.next = n1;
        n1.next = temp;
        if (previousNode != null) previousNode.next = n2;
    }
}

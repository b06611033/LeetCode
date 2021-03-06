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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode answer = new ListNode();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.remove(list.size() - n);
        ListNode temp = new ListNode();
        answer = temp;
        for (int i = 0; i < list.size(); i++) {
            ListNode newNode = new ListNode(list.get(i));
            temp.next = newNode;
            temp = newNode;
        }
        return answer.next;
    }
}

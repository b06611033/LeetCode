//Runtime: 1 ms, faster than 53.14% of Java online submissions for Reverse Nodes in k-Group.
//Memory Usage: 42.4 MB, less than 74.68% of Java online submissions for Reverse Nodes in k-Group.
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
        answer = head;
        int count = 1;
        int[] value = new int[k];
        ListNode[] list = new ListNode[k];
        value[0] = head.val;
        list[0] = head;
        while(head.next != null) {
            head = head.next;
            count++;
            list[count - 1] = head;
            value[count - 1] = head.val;
            if (count == k) {
                for (int  i = 0; i < k; i++) {
                    list[i].val = value[k-1-i];
                }
                count = 0;
            }
        }
        return answer;
    }
}

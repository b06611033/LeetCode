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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode answer = new ListNode();
        ListNode pointer = new ListNode();
        answer = pointer;
        boolean finished = false;
        while (true) {
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    finished = false;
                    break;
                } 
                finished = true;
            }
            if (finished) break;
            int smallest = Integer.MAX_VALUE;
            int listNum = 0;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < smallest) {
                    smallest = lists[i].val;
                    listNum = i;
                    }
                }
            }
            pointer.next = lists[listNum];
            pointer = pointer.next;
            lists[listNum] = lists[listNum].next;
            
        }
        return answer.next;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 42.1 MB, less than 76.09% of Java online submissions for Merge Two Sorted Lists.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode answer = new ListNode();
        ListNode pointer = new ListNode();
        answer = pointer;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                pointer = pointer.next;
                list1 = list1.next;
                if (list1 == null) {
                    pointer.next = list2;
                } 
            }
            else { 
                pointer.next = list2; 
                pointer = pointer.next;
                list2 = list2.next;
                if (list2 == null) {
                    pointer.next = list1;
                } 
            }
           
        }
        return answer.next;
    }
}

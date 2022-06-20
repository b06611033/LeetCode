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
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return mergeTwoLists(lists[0], lists[1]);
        ListNode[] listOne = Arrays.copyOfRange(lists, 0, lists.length/2);
        ListNode[] listTwo = Arrays.copyOfRange(lists, lists.length/2, lists.length);
        return mergeTwoLists(mergeKLists(listOne), mergeKLists(listTwo));
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

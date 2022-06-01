//2 pointers with a difference of n step
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
//Memory Usage: 42.4 MB, less than 34.76% of Java online submissions for Remove Nth Node From End of List.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode();
        ListNode sp = new ListNode(); // second pointer
        sp = head;
        answer = sp;
        int count = 0; //count steps
        while (head != null) {
            head = head.next;
            count++; // one step made by head
            if (count > n && head != null) sp = sp.next;
            if (head == null && count > 1 && count!=n) sp.next = sp.next.next;
        }
        if (count == 1) return null;
        if (count == n) return answer.next;
        return answer;
    }
}

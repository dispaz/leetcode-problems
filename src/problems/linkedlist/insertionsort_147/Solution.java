package problems.linkedlist.insertionsort_147;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-5001);
        ListNode ptr = dummy;
        ListNode prev = null;
        while(head != null){
            while(ptr != null && ptr.val < head.val){
                prev = ptr;
                ptr = ptr.next;
            }

            prev.next = new ListNode(head.val);
            prev.next.next = ptr;

            prev = dummy;
            ptr = dummy.next;
            head = head.next;
        }

        return dummy.next;
    }
}

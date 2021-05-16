package problems.linkedlist.swapnodesinpairs_24;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode runner = dummy;

        while(runner.next != null && runner.next.next != null){
            ListNode l1 = runner.next;
            ListNode l2 = runner.next.next;

            runner.next = l2;
            l1.next = l2.next;
            l2.next = l1;

            runner = l1;
        }
        return dummy.next;
    }
}

package problems.linkedlist.partitionlist_86;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lHead = new ListNode();
        ListNode rHead = new ListNode();
        ListNode lCurr = lHead;
        ListNode rCurr = rHead;

        while(head != null){
            if(head.val >= x){
                rCurr.next = head;
                rCurr = rCurr.next;
            } else {
                lCurr.next = head;
                lCurr = lCurr.next;
            }

            head = head.next;
        }

        rCurr.next = null;

        lCurr.next = rHead.next;
        return lHead.next;
    }
}

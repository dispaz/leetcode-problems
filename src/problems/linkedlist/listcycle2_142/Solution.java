package problems.linkedlist.listcycle2_142;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode slow2 = head;
                while(slow != slow2){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}

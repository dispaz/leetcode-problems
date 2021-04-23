package problems.linkedlist.remove_nth_node_from_end_19;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;
        while(fast != null){
            if(n > 0){
                n--;
                fast = fast.next;
                continue;
            }
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        if(head == slow ) head = head.next;
        return head;
    }
}

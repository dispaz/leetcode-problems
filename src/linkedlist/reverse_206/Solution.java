package linkedlist.reverse_206;

import linkedlist.ListNode;
import org.w3c.dom.Node;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reverseListReccursion(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode r = reverseListReccursion(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }
}

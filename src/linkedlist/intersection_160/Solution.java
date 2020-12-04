package linkedlist.intersection_160;

import linkedlist.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        if(p1 == null || p2 == null) return null;
        while(p1 != p2){
            p1 = (p1 != null) ? p1.next : headB;
            p2 = (p2 != null) ? p2.next : headA;
        }
        return p1;
    }
}

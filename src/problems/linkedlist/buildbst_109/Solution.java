package problems.linkedlist.buildbst_109;

import problems.linkedlist.ListNode;
import problems.tree.TreeNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        TreeNode result = new TreeNode(mid.val);

        slow.next = null;

        result.left = sortedListToBST(head);
        result.right = sortedListToBST(mid.next);
        return result;
    }
}

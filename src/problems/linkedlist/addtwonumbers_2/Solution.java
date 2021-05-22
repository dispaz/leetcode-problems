package problems.linkedlist.addtwonumbers_2;

import problems.linkedlist.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoLists(l1, l2, false);
    }

    private ListNode addTwoLists(ListNode l1, ListNode l2, boolean addOne){
        if(l1 == null && l2 == null && !addOne){
            return null;
        }
        ListNode node = new ListNode(addOne ? 1 : 0);
        if(l1 != null){
            node.val += l1.val;
            l1 = l1.next;
        }
        if(l2 != null) {
            node.val += l2.val;
            l2 = l2.next;
        }

        if(node.val > 9){
            addOne = true;
            node.val -= 10;
        }
        else
            addOne = false;
        node.next = addTwoLists(l1, l2, addOne);
        return node;
    }
}

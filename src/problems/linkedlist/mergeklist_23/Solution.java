package problems.linkedlist.mergeklist_23;

import problems.linkedlist.ListNode;

import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(ListNode list : lists){
            ListNode it = list;
            while(it != null){
                heap.add(it.val);
                it = it.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode it = dummy;
        while(!heap.isEmpty()){
            it.next = new ListNode(heap.poll());
            it = it.next;
        }

        return dummy.next;
    }
}

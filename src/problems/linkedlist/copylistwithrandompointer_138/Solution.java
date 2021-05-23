package problems.linkedlist.copylistwithrandompointer_138;

import problems.linkedlist.ListNode;

import java.util.HashMap;

public class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node it = head;
        while(it != null){
            insertListNode(it, new Node(it.val));
            it = it.next;
        }

        it = head;
        while(it != null && it.next != null){
            if(it.random != null){
                it.next.random = it.random.next;
            }
            it = it.next.next;
        }
        //1-‘1-2-‘2-3-‘3
        //1-2-3-
        it = head;//1, 2, 3, null
        Node copyHead = new Node(0);//0-'1-'2-'3
        Node copy = copyHead;//0, '1, '2, '3
        while(it != null){
            copy.next = it.next;
            it.next = it.next.next;
            it = it.next;
            copy = copy.next;
        }

        return copyHead.next;
    }

    private void insertListNode(Node curr, Node newNode){
        Node tmp = curr.next;
        curr.next = newNode;
        newNode.next = tmp;
    }

    public Node copyRandomList2(Node head) {
        if(head == null) return null;
        HashMap<Node, Node> map = new HashMap();

        Node it = head;
        while(it != null){
            map.put(it, new Node(it.val));
            it = it.next;
        }

        it = head;
        while(it != null){
            Node clone = map.get(it);
            clone.next = map.get(it.next);
            clone.random = map.get(it.random);
            it = it.next;
        }

        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

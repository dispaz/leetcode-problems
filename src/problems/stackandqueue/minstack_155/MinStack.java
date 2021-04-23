package problems.stackandqueue.minstack_155;

class MinStack {
    StackNode head;

    public void push(int x) {
        if(head == null){
            head = new StackNode(x);
            head.min = head.val;
            return;
        }

        head.next = new StackNode(x);
        head.next.prev = head;
        head.next.min = head.min > x ? x : head.min;
        head = head.next;
    }

    public void pop() {
        head = head.prev;
        if(head != null){
            head.next = null;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

class StackNode{
    public int val;
    public StackNode next;
    public StackNode prev;
    public int min;

    public StackNode(int value){
        this.val = value;
    }
}

package problems.stackandqueue.stackfromqueue_225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q;
    Queue<Integer> q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size > 1){
            q.add(q.remove());
            size--;
        }
    }

    public void push2(int x){
        q2.add(x);
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        Queue<Integer> temp = q;
        q = q2;
        q2 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.remove();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

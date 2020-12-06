package stackandqueue.queuefromstack_232;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
        if(stack2.size() == 0){
            while(stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.size() == 0){
            while(stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.size() == 0){
            while(stack1.size() != 0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.size() == 0 && stack2.size() == 0;
    }
}

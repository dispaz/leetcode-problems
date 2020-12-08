package stackandqueue.evaluatereversepolishnotation_150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    nums.push(nums.pop() + nums.pop());
                    break;
                case "-":
                    int last = nums.pop();
                    nums.push(nums.pop() - last);
                    break;
                case "*":
                    nums.push(nums.pop() * nums.pop());
                    break;
                case "/":
                    last = nums.pop();
                    nums.push(nums.pop() / last);
                    break;
                default:
                    int num = Integer.parseInt(tokens[i]);
                    nums.push(num);
                    break;
            }
        }
        return nums.pop();
    }
}

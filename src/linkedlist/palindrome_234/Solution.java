package linkedlist.palindrome_234;

import linkedlist.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        Result r = palindromeRecursion(head, head);
        return r.result;
    }

    private Result palindromeRecursion(ListNode head, ListNode it) {
        if (it == null) return new Result(head, true);

        Result result = palindromeRecursion(head, it.next);

        if (result.node == it) return new Result(it.next, true);
        if (result.node != null && !result.result) {
            return result;
        }

        if (result.node.val == it.val) {
            result = new Result(result.node.next, true);
        } else {
            result = new Result(it, false);
        }

        return result;

    }
}

class Result {
    public ListNode node;
    public boolean result;

    public Result() {
    }

    public Result(ListNode node, boolean result) {
        this.node = node;
        this.result = result;
    }
}


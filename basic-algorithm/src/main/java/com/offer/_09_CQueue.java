package com.offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 * */
public class _09_CQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return - 1;
    }
}

package org.uni.stack;

import java.util.Stack;

public class SolutionThird {

    private static Stack<Integer> mainStack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();


    public static void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public static void pop() {
        if (mainStack.isEmpty()) {
            return;
        }
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public static int top() {
        return mainStack.peek();
    }

    public static int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        push(-2);
        push(0);
        push(-3);
        System.out.println(getMin());
        pop();
        System.out.println(top());
        System.out.println(getMin());
    }
}

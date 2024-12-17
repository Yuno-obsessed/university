package org.uni.stack;

import java.util.Stack;

public class SolutionFourth {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void push(int x) {
        stack1.push(x);
    }

    public static int pop() {
        if (stack2.isEmpty()) {
            moveStack1ToStack2();
        }
        return stack2.pop();
    }

    public static int peek() {
        if (stack2.isEmpty()) {
            moveStack1ToStack2();
        }
        return stack2.peek();
    }

    public static boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private static void moveStack1ToStack2() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(empty());
    }
}

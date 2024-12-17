package org.uni.stack;

import java.util.Stack;

public class SolutionFirst {

    public static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validParenthesis("()"));
        System.out.println(validParenthesis("()[]{}"));
        System.out.println(validParenthesis("(]"));
        System.out.println(validParenthesis("([{}])"));
        System.out.println(validParenthesis("{[()]}"));
        System.out.println(validParenthesis("((("));
    }
}

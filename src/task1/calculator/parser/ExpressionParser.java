package task1.calculator.parser;

import java.util.Stack;

public class ExpressionParser {
    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else {
                postfix.append(' ');
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.push(c);
                }
            }
        }
        return postfix.toString().trim();
    }

    private int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }
}

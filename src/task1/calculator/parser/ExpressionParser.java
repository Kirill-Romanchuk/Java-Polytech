package task1.calculator.parser;

import java.util.Stack;

public class ExpressionParser {
    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String[] tokens = infix.split(" ");

        for (String token : tokens) {
            char c = token.charAt(0);
            if (Character.isDigit(c)) {
                postfix.append(token).append(' ');
            } else {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && OperatorPrecedence.precedence(c) <= OperatorPrecedence.precedence(stack.peek())) {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }
        return postfix.toString().trim();
    }
}


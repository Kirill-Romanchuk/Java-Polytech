package task1.cmd.service;

import task1.calculator.parser.ExpressionParser;

public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new ExpressionParser();
        System.out.println(parser.infixToPostfix("355 * ( 2 + 123 )"));
    }
}

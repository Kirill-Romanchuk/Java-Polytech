package task1.cmd.service;

import task1.calculator.Calculator;
import task1.calculator.parser.ExpressionParser;

public class Main {
    public static void main(String[] args) {
        String expression = "355 * ( 2 + 123 )";
        ExpressionParser parser = new ExpressionParser();
        System.out.println(parser.infixToPostfix(expression));
        Calculator calculator = new Calculator();
        calculator.setExpression(expression);
        calculator.Calculate();
        System.out.println(calculator.getResult());
    }
}

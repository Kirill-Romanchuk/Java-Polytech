package task1.calculator;

import task1.calculator.commands.*;
import task1.calculator.invoker.CommandInvoker;
import task1.calculator.parser.ExpressionParser;

import java.util.Stack;

public class Calculator {
    private double result;
    private String infixExpression;
    private String postfixExpression;

    public Calculator() {}

    public Calculator(String infixExpression) {setInfixExpression(infixExpression);}

    public void setInfixExpression(String infixExpression) { // TODO: What if the expression is wrong and don't worry?
        result = 0.0f;
        this.infixExpression = infixExpression;
        ExpressionParser parser = new ExpressionParser();
        postfixExpression = parser.infixToPostfix(infixExpression);
    }

    public double Calculate() {
        String[] tokens = postfixExpression.split("\\s+");
        CommandInvoker invoker = new CommandInvoker();
        Stack<Double> operands = new Stack<>();
        Stack<String> operations = new Stack<>();
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                double operand = Double.parseDouble(token);
                operands.push(operand);
            }
            else {
                operations.push(token);
            }
        }

        result = operands.pop();

        for (String operation : operations) {
            double operand = operands.pop();

            switch (operation) {
                case "+":
                    invoker.putCommand(new AddCommand(this, operand));
                    break;
                case "-":
                    invoker.putCommand(new SubtractCommand(this, operand));
                    break;
                case "*":
                    invoker.putCommand(new MultiplyCommand(this, operand));
                    break;
                case "/":
                    invoker.putCommand(new DivideCommand(this, operand));
                    break;
                // Добавьте другие операции, если нужно
            }
        }
        invoker.applyCommands();

        return result;
    }

    public void add(double value) {
        result += value;
    }

    public void subtract(double value) {
        result -= value;
    }

    public void multiply(double value) {
        result *= value;
    }

    public void divide(double value) {
        if (value == 0) {
            throw new ArithmeticException("by zero");
        }
        result /= value;
    }

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return infixExpression;
    }

    public String getPostfixExpression() {
        return postfixExpression;
    }
}

package task1.calculator;

import task1.calculator.commands.*;
import task1.calculator.invoker.CommandInvoker;
import task1.calculator.parser.ExpressionParser;

import java.util.Stack;

public class Calculator {
    private double result;
    private String infixExpression;

    public Calculator() {}

    public Calculator(String infixExpression) {setExpression(infixExpression);}

    public void setExpression(String infixExpression) { // TODO: What if the expression is wrong and don't worry?
        result = 0.0f;
        this.infixExpression = infixExpression;
    }

    public void Calculate() {
        ExpressionParser parser = new ExpressionParser();
        String postfixExpression = parser.infixToPostfix(infixExpression);

        String[] tokens = postfixExpression.split("\\s+");
        Stack<Double> operandStack = new Stack<>();
        CommandInvoker invoker = new CommandInvoker();

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                double operand = Double.parseDouble(token);
                operandStack.push(operand);
                continue;
            }

            double operand = operandStack.pop();

            switch (token) {
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

        result = operandStack.pop();
        invoker.applyCommands();

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
}

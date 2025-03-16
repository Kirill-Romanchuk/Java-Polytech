package task1.calculator.parser;

public class OperatorPrecedence {
    public static int precedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }
}

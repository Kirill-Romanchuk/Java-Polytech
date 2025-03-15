package task1.calculator;

public class Calculator {
    private double result;

    public Calculator() {
        this.result = 0.0f;
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
    }
}

package task1.commands;

import task1.calculator.Calculator;

public class MultiplyCommand implements Command {
    private final Calculator calculator;
    private final double operand;

    public MultiplyCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.multiply(operand);
    }
}

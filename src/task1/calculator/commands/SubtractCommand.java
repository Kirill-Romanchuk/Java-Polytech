package task1.calculator.commands;

import task1.calculator.Calculator;

public class SubtractCommand implements Command {
    private final Calculator calculator;
    private final double operand;

    public SubtractCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.subtract(operand);
    }
}

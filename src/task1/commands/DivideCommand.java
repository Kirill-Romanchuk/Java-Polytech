package task1.commands;

import task1.calculator.Calculator;

public class DivideCommand implements Command {
    private final Calculator calculator;
    private final double operand;

    public DivideCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        calculator.divide(operand);
    }
}

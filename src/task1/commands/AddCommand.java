package task1.commands;

import task1.calculator.Calculator;

public class AddCommand implements Command {
    private final Calculator calculator; // Получатель, который будет выполнять операцию
    private final double operand;        // Операнд для сложения

    // Конструктор, принимающий получателя и операнд
    public AddCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    // Выполнение операции сложения
    @Override
    public void execute() {
        calculator.add(operand);
    }
}

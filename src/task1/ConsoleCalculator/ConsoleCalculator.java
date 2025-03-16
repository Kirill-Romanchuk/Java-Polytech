package task1.ConsoleCalculator;

import task1.calculator.Calculator;

import java.util.Scanner;

public class ConsoleCalculator {
    private final String REQUEST_EXPRESSION_MASSAGE = "Введите выражение: ";
    private final String RESULT_MASSAGE = "Ответ: ";
    public void start() {
        while (true) {
            printMassage(REQUEST_EXPRESSION_MASSAGE);
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.nextLine();

            Calculator calculator = new Calculator();
            calculator.setInfixExpression(expression);

            double result = calculator.Calculate();
            printMassage(RESULT_MASSAGE + '\n' + result);
        }
    }

    private void printMassage(String massage) {
        System.out.println(massage);
    }
}

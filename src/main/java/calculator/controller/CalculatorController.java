package calculator.controller;

import calculator.View.InputView;
import calculator.View.OutputView;
import calculator.domin.Calculator;

public class CalculatorController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        outputView.printInputNumber();
        String input = inputView.getString();
        int result = Calculator.calculate(input);
        outputView.printResult(result);
    }
}

package calculator.domin;

public class StringCalculator {
    private static final int ZERO = 0;

    public static int calculate(String input) {
        if (isBlank(input)) {
            return ZERO;
        }
        return ExpressionParser.of(input).sum();
    }

    private static boolean isBlank(String input) {
        return input == null || input.isBlank();
    }
}

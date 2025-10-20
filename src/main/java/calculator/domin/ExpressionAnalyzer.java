package calculator.domin;

public class ExpressionAnalyzer {
    private final String input;

    private ExpressionAnalyzer(String input) {
        this.input = input;
    }

    public static ExpressionAnalyzer of(String input) {
        return new ExpressionAnalyzer(input);
    }

    public int sum() {
        String[] tokens = DelimiterParser.from(input).splitByText();
        Numbers numbers = Numbers.from(tokens);
        return numbers.sum();
    }
}

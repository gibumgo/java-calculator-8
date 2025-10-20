package calculator.domin;

public class ExpressionParser {
    private final String input;

    private ExpressionParser(String input) {
        this.input = input;
    }

    public static ExpressionParser of(String input) {
        return new ExpressionParser(input);
    }

    public int sum() {
        String[] tokens = DelimiterExtractor.from(input).splitByText();
        Numbers numbers = Numbers.from(tokens);
        return numbers.sum();
    }
}

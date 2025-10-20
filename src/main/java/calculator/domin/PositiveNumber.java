package calculator.domin;

public class PositiveNumber {
    private static final int MIN_NUMBER = 0;
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "숫자를 입력해주세요.";
    private static final String NUMBER_RANGE_ERROR_MESSAGE = "양수를 입력해주세요.";
    private final int number;

    private PositiveNumber(int number) {
        validatePositive(number);
        this.number = number;
    }

    private PositiveNumber(String number) {
        int parsedNumber = parseNumber(number);
        validatePositive(parsedNumber);
        this.number = parsedNumber;
    }

    public static PositiveNumber create(String number){
        return new PositiveNumber(number);
    }

    private static int parseNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    private static void validatePositive(int number) {
        if (number < MIN_NUMBER) {
            throw new IllegalArgumentException(NUMBER_RANGE_ERROR_MESSAGE);
        }
    }

    public PositiveNumber plus(PositiveNumber number) {
        return new PositiveNumber(this.number + number.number);
    }

    public int toInt() {
        return this.number;
    }
}

package calculator.domin;

public class Delimiter {
    private static final String DELIMITER = ",|:";
    private final String regex;

    private Delimiter(String regex) {
        this.regex = regex;
    }

    private Delimiter() {
        this.regex = DELIMITER;
    }

    public static Delimiter defaultDelimiter() {
        return new Delimiter();
    }

    public static Delimiter custom(String input) {
        return new Delimiter(input);
    }

    public String[] splitText(String text) {
        return text.split(this.regex);
    }
}

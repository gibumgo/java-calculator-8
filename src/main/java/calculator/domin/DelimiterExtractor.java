package calculator.domin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterExtractor {
    private static final String LINE_BREAK = "\n";
    private static final String ESCAPE_LINE_BREAK = "\\n";
    private static final String CUSTOM_DELIMITER_REGEX = "//(.)" + ESCAPE_LINE_BREAK + "(.*)";
    private static final Pattern CUSTOM_PATTERN = Pattern.compile(CUSTOM_DELIMITER_REGEX);
    private static final int DELIMITER_INDEX = 1;
    private static final int TOKEN_INDEX = 2;

    private final String input;

    private DelimiterExtractor(String input) {
        this.input = preprocessInput(input);
    }

    public static DelimiterExtractor from(String input) {
        return new DelimiterExtractor(input);
    }

    private String preprocessInput(String input) {
        return input.replace(ESCAPE_LINE_BREAK, LINE_BREAK);
    }

    public String[] splitByText() {
        Matcher matcher = CUSTOM_PATTERN.matcher(input);
        if (hasCustomDelimiter(matcher)) {
            return splitWithCustomDelimiter(matcher);
        }
        return splitWithDefaultDelimiter(this.input);
    }

    private static String[] splitWithCustomDelimiter(Matcher matcher) {
        String custom = matcher.group(DELIMITER_INDEX);
        String numbers = matcher.group(TOKEN_INDEX);
        return Delimiter.custom(custom).splitText(numbers);
    }

    private static boolean hasCustomDelimiter(Matcher matcher) {
        return matcher.find();
    }

    private String[] splitWithDefaultDelimiter(String input) {
        return Delimiter.defaultDelimiter().splitText(input);
    }
}

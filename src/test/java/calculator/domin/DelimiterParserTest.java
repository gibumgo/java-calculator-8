package calculator.domin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DelimiterParserTest {
    @Test
    @DisplayName("커스텀 구분자 테스트")
    void 커스텀_구분자_테스트() {
        String[] result = DelimiterParser.from("//;\n1;2;3").splitByText();
        assertThat(result).containsExactly("1", "2", "3");
    }
}
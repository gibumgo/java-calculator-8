package calculator.domin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DelimiterTest {
    @Test
    @DisplayName("기본 구분자 쉼표와 콜론으로 문자열 분리")
    void 기본_구분자_테스트() {
        Delimiter delimiter = Delimiter.defaultDelimiter();
        String[] result = delimiter.splitText("1,2:3");
        assertThat(result).containsExactly("1", "2", "3");
    }
}
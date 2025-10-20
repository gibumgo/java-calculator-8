package calculator.domin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringCalculatorTest {

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("빈 문자열 또는 null 입력 시 0 반환")
    void 빈문자_null_입력_테스트(String input) {
        int result = StringCalculator.calculate(input);
        assertThat(result).isEqualTo(0);
    }

}
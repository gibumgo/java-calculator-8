package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class NumberTest {

    @Test
    @DisplayName("문자열을 정수로 변환 성공 테스트")
    void 문자열_정수_변환_테스트() {
        Number number = Number.create("3");
        assertThat(number.toInt()).isEqualTo(3);
    }

    @Test
    @DisplayName("숫자가 아닌 입력 시 예외 발생 테스트")
    void 숫자아님_예외_테스트() {
        assertThatThrownBy(() -> Number.create("abc"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자를 입력해주세요.");
    }

    @Test
    @DisplayName("음수 입력 시 예외 발생 테스트")
    void 음수_입력_예외_테스트() {
        assertThatThrownBy(() -> Number.create("-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("양수를 입력해주세요.");
    }

    @Test
    @DisplayName("두 숫자를 더하는 plus() 기능 테스트")
    void plus_기능_테스트() {
        Number number = Number.create("2");
        Number otherNumber = Number.create("3");
        assertThat(number.plus(otherNumber).toInt()).isEqualTo(5);
    }
}
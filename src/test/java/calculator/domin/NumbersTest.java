package calculator.domin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumbersTest {
    @Test
    @DisplayName("여러 양수를 합산하는 기능 테스트")
    void 여러_양수_합산_테스트() {
        String[] inputs = {"1", "2", "3"};
        Numbers numbers = Numbers.from(inputs);
        assertThat(numbers.sum()).isEqualTo(6);
    }

    @Test
    @DisplayName("빈 배열 입력 시 합산 결과 0 반환 테스트")
    void 빈배열_입력_테스트() {
        Numbers numbers = Numbers.from(new String[]{});
        assertThat(numbers.sum()).isEqualTo(0);
    }
}
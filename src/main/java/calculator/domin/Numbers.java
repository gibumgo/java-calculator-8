package calculator.domin;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    private  final List<PositiveNumber> numbers;


    private Numbers(List<PositiveNumber> numbers) {
        this.numbers = numbers;
    }

    public static Numbers from(String[] input) {
        List<PositiveNumber> list = Arrays.stream(input)
                .map(PositiveNumber::create)
                .toList();
        return new Numbers(list);
    }


    public int sum() {
        return  numbers.stream()
                .mapToInt(PositiveNumber::toInt)
                .sum();
    }
}

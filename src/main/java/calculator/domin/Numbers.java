package calculator.domin;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    private  final List<Number> numbers;


    private Numbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public static Numbers from(String[] input) {
        List<Number> list = Arrays.stream(input)
                .map(Number::create)
                .toList();
        return new Numbers(list);
    }


    public int sum() {
        return  numbers.stream()
                .mapToInt(Number::toInt)
                .sum();
    }
}

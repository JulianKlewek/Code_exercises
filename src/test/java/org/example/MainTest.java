package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_greatest_common_divisor(int number1, int number2, int greatestDivisor) {
        int result = main.solution(number1, number2);
        Assertions.assertEquals(greatestDivisor, result);
    }

    @Disabled("No method source")
    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false(int number1, int number2, int greatestDivisor) {
        int result = main.solution(number1, number2);
        Assertions.assertNotEquals(greatestDivisor, result);
    }
}
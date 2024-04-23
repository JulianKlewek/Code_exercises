package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_MULTIPLIES_3")
    void should_return_Fizz(Integer i) {
        String result = main.solution(i);
        Assertions.assertEquals("Fizz",result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_MULTIPLIES_5")
    void should_return_Buzz(Integer i) {
        String result = main.solution(i);
        Assertions.assertEquals("Buzz",result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_MULTIPLIES_3_AND_5")
    void should_return_FizzBuzz(Integer i) {
        String result = main.solution(i);
        Assertions.assertEquals("FizzBuzz",result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_MULTIPLIES_NOT_3_OR_5")
    void should_return_input_number(Integer i) {
        String result = main.solution(i);
        Assertions.assertEquals(i.toString(),result);
    }
}
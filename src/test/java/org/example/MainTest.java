package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(Integer i) {
        boolean result = main.solution(i);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false(Integer i) {
        boolean result = main.solution(i);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_LARGEST_PRIME_FACTOR")
    void should_return_true(Integer i, int expected) {
        Integer result = main.largestPrimeFactor(i);
        Assertions.assertEquals(expected, result);
    }
}
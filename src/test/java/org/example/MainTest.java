package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_MOVES")
    void should_return_true(String moves) {
        boolean result = main.solution(moves);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_MOVES")
    void should_return_false(String moves) {
        boolean result = main.solution(moves);
        Assertions.assertFalse(result);
    }
}
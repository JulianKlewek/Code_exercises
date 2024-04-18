package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(String moves) {
        boolean result = Main.solution(moves);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false(String moves) {
        boolean result = Main.solution(moves);
        Assertions.assertFalse(result);
    }
}
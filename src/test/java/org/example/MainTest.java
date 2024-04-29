package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(Integer big, Integer small, Integer goal, Integer expected) {
        int result = main.solution(big, small, goal);
        Assertions.assertEquals(expected, result);
    }

}

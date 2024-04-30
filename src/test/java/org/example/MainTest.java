package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true_for_solution_one(String code, int shift, String expectedString) {
        String result = main.solutionOne(code, shift);
        Assertions.assertEquals(expectedString, result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true_for_solution_two(String code, int shift, String expectedString) {
        String result = main.solutionTwo(code, shift);
        Assertions.assertEquals(expectedString, result);
    }
}
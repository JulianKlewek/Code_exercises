package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_0")
    void should_return_zero(String string) {
        int result = main.solution(string);
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_1")
    void should_return_one(String string) {
        int result = main.solution(string);
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_2")
    void should_return_two(String string) {
        int result = main.solution(string);
        Assertions.assertEquals(2,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_3")
    void should_return_three(String string) {
        int result = main.solution(string);
        Assertions.assertEquals(3,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_5")
    void should_return_five(String string) {
        int result = main.solution(string);
        Assertions.assertEquals(5,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_0")
    void should_return_zero_for_lambda_solution(String string) {
        int result = main.solutionWithOneStream(string);
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_1")
    void should_return_one_for_lambda_solution(String string) {
        int result = main.solutionWithOneStream(string);
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_2")
    void should_return_two_for_lambda_solution(String string) {
        int result = main.solutionWithOneStream(string);
        Assertions.assertEquals(2,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_3")
    void should_return_three_for_lambda_solution(String string) {
        int result = main.solutionWithOneStream(string);
        Assertions.assertEquals(3,result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_EXPECTED_5")
    void should_return_five_for_lambda_solution(String string) {
        int result = main.solutionWithOneStream(string);
        Assertions.assertEquals(5,result);
    }
}
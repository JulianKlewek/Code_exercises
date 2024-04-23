package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_nth_element_of_fibonacci(int index, int expected) {
        Integer result = main.solution(index);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_nth_element_of_fibonacci_without_recurrence(int index, int expected) {
        Integer result = main.solutionWithoutRecurrence(index);
        Assertions.assertEquals(expected, result);
    }

}
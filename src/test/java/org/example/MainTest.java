package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @DisplayName("Return nth element")
    @MethodSource("PROVIDE_VALID_DATA_FOR_NTH_FIBONACCI")
    void should_return_nth_element_of_fibonacci(int index, int expected) {
        Integer result = main.returnNthElementOfFibonacci(index);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Return nth element with recurrence")
    @MethodSource("PROVIDE_VALID_DATA_FOR_NTH_FIBONACCI")
    void should_return_nth_element_of_fibonacci_without_recurrence(int index, int expected) {
        Integer result = main.returnNthElementOfFibonacciWithRecurrence(index);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Return even sum lesser or equal limit")
    @MethodSource("PROVIDE_VALID_DATA_FOR_EVEN_FIBONACCI_SUM")
    void should_return_sum_of_even_numbers_less_or_equals_limit(int limit, int expected) {
        Integer result = main.evenFibonacciSum(limit);
        Assertions.assertEquals(expected, result);
    }

}
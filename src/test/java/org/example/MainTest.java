package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_SUMS_TO_TARGET")
    void should_return_true(Integer[] arr, int target, boolean expected) {
        boolean result = main.sumsToTarget(arr, target);
        Assertions.assertEquals(expected, result);
    }

}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(List<String> list, List<String> expectedList) {
        List<String> resultList = main.search(list);
        Assertions.assertEquals(expectedList, resultList);
    }
//
//    @ParameterizedTest
//    @MethodSource("PROVIDE_INVALID_DATA")
//    void should_return_false(String string) {
//        boolean result = main.solution(string);
//        Assertions.assertFalse(result);
//    }
}
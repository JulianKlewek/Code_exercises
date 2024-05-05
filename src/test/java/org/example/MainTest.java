package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_longest_common_sequence(String string1, String string2, String expected) {
        String result = main.findLongestCommonSequence(string1, string2);
        Assertions.assertEquals(expected, result);
    }

}
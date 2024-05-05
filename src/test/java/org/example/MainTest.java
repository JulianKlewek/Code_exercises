package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(String word) {
        boolean result = main.solution(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false(String word) {
        boolean result = main.solution(word);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true_for_2nd_method(String word) {
        boolean result = main.solutionTwo(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false_for_2nd_method(String word) {
        boolean result = main.solutionTwo(word);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true_for_3rd_method(String word) {
        boolean result = main.solutionThree(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false_for_3rd_method(String word) {
        boolean result = main.solutionThree(word);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_LONGEST_PALINDROME")
    void should_return_longest_palindrome(String word, String expectedPalindrome) {
        String result = main.findLongestPalindrome(word);
        Assertions.assertEquals(expectedPalindrome, result);
    }
}
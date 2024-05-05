package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of("abcba"),
                Arguments.of("kamilslimak"),
                Arguments.of("a")
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of("baba"),
                Arguments.of("alllllll"),
                Arguments.of("Kamilslimak")
        );
    }

    static Stream<Arguments> PROVIDE_DATA_FOR_LONGEST_PALINDROME() {
        return Stream.of(
                Arguments.of("baba", "bab"),
                Arguments.of("alllllll", "lllllll"),
                Arguments.of("abattd", "aba"),
                Arguments.of("abc", "a"),
                Arguments.of("abcba", "abcba"),
                Arguments.of("thhwerw", "hh"),
                Arguments.of("kamilslimak", "kamilslimak")
        );
    }


}

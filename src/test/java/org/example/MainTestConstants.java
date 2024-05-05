package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of("abattd", "gdgeaba", "aba"),
                Arguments.of("abc", "sdsad", "a"),
                Arguments.of("abcba", "abcba", "abcba"),
                Arguments.of("thhwerwaaa", "aaa", "aaa")
        );
    }


}

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


}

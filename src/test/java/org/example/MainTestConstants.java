package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(2),
                Arguments.of(3),
                Arguments.of(7)
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of(4),
                Arguments.of(21)
        );
    }


}

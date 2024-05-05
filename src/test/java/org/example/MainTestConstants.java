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

    static Stream<Arguments> PROVIDE_DATA_FOR_LARGEST_PRIME_FACTOR() {
        return Stream.of(
                Arguments.of(455, 13),
                Arguments.of(21, 7),
                Arguments.of(2, 2),
                Arguments.of(55, 11),
                Arguments.of(1015, 29),
                Arguments.of(13195, 29)
        );
    }

}

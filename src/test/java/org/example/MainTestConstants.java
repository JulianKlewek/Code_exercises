package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(1, 0, 5, 0),
                Arguments.of(1, 0, 4, -1),
                Arguments.of(0, 5, 4, 4),
                Arguments.of(2, 2, 11, 1),
                Arguments.of(2, 0, 9, -1),
                Arguments.of(2, 2, 12, 2),
                Arguments.of(2, 1, 12, -1),
                Arguments.of(2, 1, 5, 0),
                Arguments.of(5, 3, 24, -1),
                Arguments.of(2, 7, 18, -1),
                Arguments.of(2, 10, 18, 8)
        );
    }


}

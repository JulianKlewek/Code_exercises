package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(1, 0, 5),
                Arguments.of(0, 5, 4),
                Arguments.of(2, 2,11)
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of(1, 0, 4),
                Arguments.of(-3, 2, 12)
        );
    }


}

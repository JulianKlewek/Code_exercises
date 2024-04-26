package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(4, 6, 2),
                Arguments.of(100, 110, 10),
                Arguments.of(100, 200, 100),
                Arguments.of(200, 100, 100)
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of(),
                Arguments.of()
        );
    }


}

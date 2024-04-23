package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_DATA_MULTIPLIES_3() {
        return Stream.of(
                Arguments.of(3),
                Arguments.of(6),
                Arguments.of(9)
        );
    }

    static Stream<Arguments> PROVIDE_DATA_MULTIPLIES_5() {
        return Stream.of(
                Arguments.of(5),
                Arguments.of(10)
        );
    }

    static Stream<Arguments> PROVIDE_DATA_MULTIPLIES_3_AND_5() {
        return Stream.of(
                Arguments.of(15),
                Arguments.of(30)
                );
    }
    static Stream<Arguments> PROVIDE_DATA_MULTIPLIES_NOT_3_OR_5() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(14)
                );
    }

}

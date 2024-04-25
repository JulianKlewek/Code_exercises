package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA_FOR_NTH_FIBONACCI() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(7, 13),
                Arguments.of(8, 21),
                Arguments.of(9, 34)
        );
    }

    static Stream<Arguments> PROVIDE_VALID_DATA_FOR_EVEN_FIBONACCI_SUM() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(50, 44),
                Arguments.of(450, 188),
                Arguments.of(1000, 798)
        );
    }

}

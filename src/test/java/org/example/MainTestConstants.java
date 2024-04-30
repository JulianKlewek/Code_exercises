package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of("xvm", 5, "car"),
                Arguments.of("attackatonce", 4, "exxegoexsrgi"),
                Arguments.of("evqv", 5, "java"),
                Arguments.of("diozmqdzr", 5, "interview")
        );
    }

}

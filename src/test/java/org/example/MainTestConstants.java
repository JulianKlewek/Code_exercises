package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA_FOR_PHONE_NUMBER_VALIDATION() {
        return Stream.of(
                Arguments.of("123456789", true),
                Arguments.of("123 456 789", true),
                Arguments.of("123-456-789", true),
                Arguments.of("(+48)123-456-789", true),
                Arguments.of("(48)123-456-789", true)
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA_FOR_PHONE_NUMBER_VALIDATION() {
        return Stream.of(
                Arguments.of("123 4567 89", false),
                Arguments.of("123 4d6 789", false),
                Arguments.of("9", false),
                Arguments.of("9876543210", false)
        );
    }


}

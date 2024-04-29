package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(List.of(3, 44), "o3,e44"),
                Arguments.of(List.of(1, 5, 7, 8), "o1,o5,o7,e8"),
                Arguments.of(List.of(101, 44), "o101,e44"),
                Arguments.of(List.of(100), "e100")
        );
    }

}

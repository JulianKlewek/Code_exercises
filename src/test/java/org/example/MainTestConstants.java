package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_DATA() {
        return Stream.of(
                Arguments.of(List.of("abc", "ads", "vas", "aaaa", "ass", "dasda"), List.of("abc", "ads", "ass")),
                Arguments.of(List.of("ab", "abcd"), List.of()),
                Arguments.of(List.of("aaa"), List.of("aaa"))
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of(),
                Arguments.of()
        );
    }


}

package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_VALID_MOVES() {
        return Stream.of(
                Arguments.of("^^^<<<<vvv>>>>"),
                Arguments.of("<vvv>>^^^<")
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_MOVES() {
        return Stream.of(
                Arguments.of("<^^^>v"),
                Arguments.of("^^vv"),
                Arguments.of("^"),
                Arguments.of(""),
                Arguments.of("<^v>"),
                Arguments.of("^>^>vv<<"),
                Arguments.of("^v"),
                Arguments.of( "^^^^>v>^>>vvvv<<<<")

        );
    }


}

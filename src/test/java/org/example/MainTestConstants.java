package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_DATA_EXPECTED_0() {
        return Stream.of(
                Arguments.of("")
        );
    }

    static Stream<Arguments> PROVIDE_DATA_EXPECTED_1() {
        return Stream.of(
                Arguments.of("as"),
                Arguments.of("s"),
                Arguments.of("acbbbbbb"),
                Arguments.of("bba")
        );
    }

    static Stream<Arguments> PROVIDE_DATA_EXPECTED_2() {
        return Stream.of(
                Arguments.of("aa"),
                Arguments.of("abaaba")
        );
    }

    static Stream<Arguments> PROVIDE_DATA_EXPECTED_3() {
        return Stream.of(
                Arguments.of("yzyzy")
        );
    }

    static Stream<Arguments> PROVIDE_DATA_EXPECTED_5() {
        return Stream.of(
                Arguments.of("zyzyzyz"),
                Arguments.of("aaaaa")
        );
    }


}

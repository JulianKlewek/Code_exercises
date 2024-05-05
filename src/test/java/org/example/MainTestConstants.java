package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_DATA_FOR_SUMS_TO_TARGET() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 3, 4}, 5, true),
                Arguments.of(new Integer[]{1, 3, 4}, 2, false),
                Arguments.of(new Integer[]{2, 4, 6}, 5, false),
                Arguments.of(new Integer[]{-1, 4, 2, 1}, 0, true),
                Arguments.of(new Integer[]{-1, 4, 2, 1}, 1, true)
        );
    }

}

package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    @Test
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true(String string) {
    }

    @Test
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false(String string) {
    }
}
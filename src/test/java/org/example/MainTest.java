package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @DisplayName("Valid phoneNumbers")
    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA_FOR_PHONE_NUMBER_VALIDATION")
    void should_return_true_if_phone_number_validated_successfully(String string) {
        boolean result = main.validatePhoneNumber(string);
        Assertions.assertTrue(result);
    }

    @DisplayName("Invalid phoneNumbers")
    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA_FOR_PHONE_NUMBER_VALIDATION")
    void should_return_false_if_phone_number_validated_unsuccessfully(String string) {
        boolean result = main.validatePhoneNumber(string);
        Assertions.assertFalse(result);
    }

    @DisplayName("Valid two numbers sum")
    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA_TWO_NUMBERS_WITHOUT_ZEROS_WHICH_SUMS_TO_TARGET")
    void should_return_true_if_numbers_does_not_contain_zeros_and_sums_to_target(int target) {
        int[] result = main.findTwoNumbersWithoutZerosWhichSumsToTarget(target);

        Assertions.assertEquals(target, Integer.sum(result[0], result[1]));
        Assertions.assertFalse(String.valueOf(result[0]).contains("0"));
        Assertions.assertFalse(String.valueOf(result[1]).contains("0"));
    }
}
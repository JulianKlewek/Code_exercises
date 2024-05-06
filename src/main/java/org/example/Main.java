package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        String regEx = "^(\\((\\+)?\\d{2}\\))?(\\d{3}[- .]?){2}\\d{3}$";
//        Pattern pattern = Pattern.compile(regEx);
//        Matcher matcher = pattern.matcher(phoneNumber);
        return Pattern.compile(regEx).matcher(phoneNumber).matches();
    }

    public int[] findTwoNumbersWithoutZerosWhichSumsToTarget(int target) {
        int[] result = new int[2];

        int firstNumber = target % 2 == 0 ? target / 2 : target / 2 + 1;
        int secondNumber = target / 2;

        while (String.valueOf(firstNumber).contains("0") || String.valueOf(secondNumber).contains("0")) {
            firstNumber++;
            secondNumber--;
        }
        result[0] = firstNumber;
        result[1] = secondNumber;

        return result;
    }
}
package org.example;

import java.util.regex.Matcher;
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
}
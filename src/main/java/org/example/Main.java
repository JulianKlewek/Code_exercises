package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public Boolean sumsToTarget(Integer[] arr, Integer target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (Integer actualValue : arr) {
            int missingValue = target - actualValue;
            if (numbersMap.containsKey(actualValue)) {
                return true;
            } else {
                numbersMap.put(missingValue, actualValue);
            }
        }
        return false;
    }
}
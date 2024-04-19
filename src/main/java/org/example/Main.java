package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //default implementation
    }

    public int solution(String string){
        if(string.isEmpty()){
            return 0;
        }
        List<String> substringsList = new ArrayList<>();
        Map<String, Integer> substringOccurrencesMap = new HashMap<>();

        for (int i = 0; i < string.length() ; i++) {
            for (int j = i+1; j <= string.length(); j++) {
                substringsList.add(string.substring(i,j));
            }
        }
        System.out.println("Substring list: " + substringsList);

        for (String substring: substringsList) {
            substringOccurrencesMap.put(substring,substringOccurrencesMap.getOrDefault(substring, 0)+1);
        }
        System.out.println("substringsMap with occurrences: " + substringOccurrencesMap);

        Integer minValue = Collections.min(substringOccurrencesMap.values());
        System.out.println("Minimal occurrences value: " + minValue);

        List<String> uniqueKeysList = substringOccurrencesMap.entrySet().stream()
                .filter(val -> val.getValue().equals(minValue))
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Unique keys list: " + uniqueKeysList);

        return uniqueKeysList.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("")
                .length();
    }

    public int solutionWithOneStream(String string){
        List<String> substringsList = new ArrayList<>();
        Map<String, Integer> substringOccurrencesMap = new HashMap<>();

        for (int i = 0; i < string.length() ; i++) {
            for (int j = i+1; j <= string.length(); j++) {
                substringsList.add(string.substring(i,j));
            }
        }

        for (String substring: substringsList) {
            substringOccurrencesMap.put(substring,substringOccurrencesMap.getOrDefault(substring, 0)+1);
        }

        return substringOccurrencesMap.entrySet().stream()
                .filter(val -> val.getValue().equals(Collections.min(substringOccurrencesMap.values())))
                .map(Map.Entry::getKey)
                .min(Comparator.comparing(String::length))
                .orElse("")
                .length();
    }

}
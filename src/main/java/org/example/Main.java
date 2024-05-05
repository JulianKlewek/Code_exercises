package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public String findLongestCommonSequence(String s1, String s2) {
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            int index = s1.length();
            while (index > i) {
                if (s2.contains(s1.substring(i, index))) {
                    result = s1.substring(i, index);
                    break;
                }
                index--;
            }
            if(!result.isEmpty()){
                break;
            }
        }
        return result;
    }
}
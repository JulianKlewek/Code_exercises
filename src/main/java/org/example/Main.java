package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public String solutionOne(String code, int shift) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] shiftedAlphabet = new char[alphabet.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            if(i + shift > alphabet.length - 1){
                int newIndex = i + shift - alphabet.length;
                shiftedAlphabet[i] = alphabet[newIndex];
            }else{
                shiftedAlphabet[i] = alphabet[i + shift];
            }
        }

        for (char c: code.toCharArray()) {
            for (int i = 0; i < alphabet.length; i++) {
                if(c == alphabet[i]){
                  result.append(shiftedAlphabet[i]);
                }
            }
        }

        return result.toString();
    }

    public String solutionTwo(String code, int shift) {
        int alphabetLength = 'z' - 'a' + 1;
        char[] alphabet = new char[alphabetLength];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < alphabetLength; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        System.out.println(alphabet);

        return result.toString();
    }
}
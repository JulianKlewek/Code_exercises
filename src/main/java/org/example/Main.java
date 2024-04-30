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
//            if(i + shift > alphabet.length - 1){
//                int newIndex = i + shift - alphabet.length;
//                shiftedAlphabet[i] = alphabet[newIndex];
//            }else{
//                shiftedAlphabet[i] = alphabet[i + shift];
//            }
            // with ? : operator
            shiftedAlphabet[i] = i + shift > alphabet.length - 1 ?
                    alphabet[i + shift - alphabet.length] : alphabet[i + shift];
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
        StringBuilder result = new StringBuilder();

        for (char c: code.toCharArray()) {
            int charIndex = c + shift < 'z' ? c + shift : c + shift - alphabetLength;
            result.append((char)charIndex);
        }

        return result.toString();
    }
}
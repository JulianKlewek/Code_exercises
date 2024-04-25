package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public boolean solution(String word){
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0 ; i--) {
            reverseWord.append(word.charAt(i));
        }

        return word.equals(reverseWord.toString());
    }

    /**
     * Zmiana w ifie, dzięki temu nie potrzeba używać toString()
     * @param word
     * @return
     */
    public boolean solutionTwo(String word){
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0 ; i--) {
            reverseWord.append(word.charAt(i));
        }

        return word.contentEquals(reverseWord);
    }

    /**
     * StringBuilder ma po prostu metode reverse()
     * @param word
     * @return
     */
    public boolean solutionThree(String word){
        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord.reverse();

        return word.contentEquals(reverseWord);
    }
}
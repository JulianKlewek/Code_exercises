package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    //region exercise 1
    public boolean solution(String word) {
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        return word.equals(reverseWord.toString());
    }

    /**
     * Zmiana w ifie, dzięki temu nie potrzeba używać toString()
     *
     * @param word
     * @return
     */
    public boolean solutionTwo(String word) {
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        return word.contentEquals(reverseWord);
    }

    /**
     * StringBuilder ma po prostu metode reverse()
     *
     * @param word
     * @return
     */
    public boolean solutionThree(String word) {
        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord.reverse();

        return word.contentEquals(reverseWord);
    }
    //endregion

    //region exercise 2
    public String findLongestPalindrome(String word) {
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            String currentPalindrome = findInnerPalindrome(word.substring(i));
            if(currentPalindrome.length() > longestPalindrome.length()){
                longestPalindrome = currentPalindrome;
            }
        }

        return longestPalindrome;
    }

    private String findInnerPalindrome(String innerString) {
        int index = innerString.length();

        while(index > 0 && !isPalindrome(innerString.substring(0, index))){
            index--;
        }

        return innerString.substring(0, index);
    }

    private boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();

        return word.contentEquals(stringBuilder);
    }
    //endregion
}
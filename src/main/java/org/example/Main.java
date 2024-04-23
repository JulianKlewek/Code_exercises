package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public String solution(Integer i){
        if(i%3 == 0 && i%5 == 0){
            return "FizzBuzz";
        } else if (i%3 == 0) {
            return "Fizz";
        } else if (i%5 == 0) {
            return "Buzz";
        } else{
            return i.toString();
        }
    }
}
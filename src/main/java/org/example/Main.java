package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public boolean solution(Integer i){
        for (int j = 2; j < i; j++) {
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }
}
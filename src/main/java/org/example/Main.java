package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public int getNumberSmallBags(Integer bigCount, Integer smallCount, Integer goal){
        int bigValue = 5;

        if (bigValue * bigCount + smallCount < goal){
            return -1;
        } else if (bigValue * bigCount >= goal && smallCount >= goal % 5) {
            return goal % 5;
        }

        return goal - (bigCount * bigValue);
    }
}
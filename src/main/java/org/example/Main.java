package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }


    //region exercise 1
    public boolean solution(Integer i){
        for (int j = 2; j < i; j++) {
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }

    //endregion

    //region exercise 2
    public Integer largestPrimeFactor(Integer n) {


        return 0;
    }

    //endregion
}
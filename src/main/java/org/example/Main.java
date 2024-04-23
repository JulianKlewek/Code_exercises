package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    public Integer solution(Integer n){
        if (n <= 1){
            return n;
        }
        return solution(n - 1) + solution(n - 2);
    }

    public Integer solutionWithoutRecurrence(Integer n){
        int twoLower = 0;
        int oneLower = 1;
        int result = 1;

        if(n == 0){
            return 0;
        }

        for (int i = 2; i <= n; i++) {
            result = twoLower + oneLower;
            twoLower = oneLower;
            oneLower = result;
        }
        return result;
    }

}
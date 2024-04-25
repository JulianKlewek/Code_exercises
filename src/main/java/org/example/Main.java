package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }


    //region Find nth element of fibonacci
    public Integer returnNthElementOfFibonacci(Integer n){
        if (n <= 1){
            return n;
        }
        return returnNthElementOfFibonacci(n - 1) + returnNthElementOfFibonacci(n - 2);
    }

    public Integer returnNthElementOfFibonacciWithRecurrence(Integer n){
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

//endregion
//region even Fibonacci sum
    public Integer evenFibonacciSum(int limit) {
        int evenFibonacciSum = 0;
        int currentMinusTwo = 1;
        int currentMinusOne = 1;
        int currentNumber = 2;

        do {
            if(currentNumber % 2 == 0){
                evenFibonacciSum += currentNumber;
            }
            currentMinusTwo = currentMinusOne;
            currentMinusOne = currentNumber;
            currentNumber = currentMinusOne + currentMinusTwo;
        }
        while (currentNumber < limit);

    return evenFibonacciSum;
}
//endregion

}
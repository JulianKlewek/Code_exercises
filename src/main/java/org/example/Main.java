package org.example;

public class Main {
    public static void main(String[] args) {
        //default impl
    }

    /**
     * Algorytm euklidesa
     * @param p
     * @param q
     * @return
     */
    public int solution(Integer p, Integer q){
        if(q == 0){
            return p;
        }

        return solution(q,p % q);
    }
}
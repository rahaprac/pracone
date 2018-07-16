package com.prac.java;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int fib1 = 1, fib2 = 1, fib = 1;
        for (int i = 3; i <= n; i++) {
            if (fib > 10) {
                break;
            }
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        System.out.println(fib);
    }
}

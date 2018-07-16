package com.prac.java;

class PrimeNum {
    public static void main(String[] args) {
        int num = 14;

        for (int i = 2; i < num; i++) {
            int rem = num % i;
            if (rem == 0) {
                System.out.println("given num is not prime");
                break;
            } else if (i == num - 1) {
                System.out.println("given num is prime");
                break;
            }
        }
    }
}

package com.prac.java;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < 5; i++) {
            total -= arr[i];
        }
        System.out.println(total);
    }

}

package com.prac.java;

public class ReverseString {
    public static void main(String[] args) {
        String name = "rajashekar";
        StringBuilder reverse = new StringBuilder();
        int strLen = name.length();
        System.out.println(strLen);
        if (name.length() > 1) {
            for (int i = strLen - 1; i >= 0; i--) {
                char let = name.charAt(i);
                reverse.append(let);
            }
            System.out.println("Reverse string of given str is " + reverse.toString());
        } else if (name.length() == 1) {
            System.out.println("Reverse string of given str is " + name);
        } else {
            System.out.println("String is empty");
        }
    }
}

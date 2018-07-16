package com.prac.java;

public class Palandrome {
    public static void main(String[] args) {
        String name = "rar";
        StringBuilder reverse = new StringBuilder();
        int strLen = name.length();
        if (name.length() > 1) {
            for (int i = strLen - 1; i >= 0; i--) {
                char let = name.charAt(i);
                reverse.append(let);
            }
            if (reverse.toString().equalsIgnoreCase(name)) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String is not palindrome");
            }
        } else if (name.length() == 1) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is empty");
        }
    }

}

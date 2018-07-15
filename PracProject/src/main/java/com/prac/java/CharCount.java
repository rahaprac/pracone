package com.prac.java;

import java.util.HashMap;
import java.util.Map;

class CharCount {
    public static void main(String[] args) {
        String name = "Raja";
        Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (!wordMap.containsKey(letter)) {
                wordMap.put(letter, 1);
            } else {

                int count = wordMap.get(letter);
                wordMap.put(letter, count + 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            System.out.print(entry.getValue().intValue() + "" + entry.getKey().charValue());
        }

    }
}

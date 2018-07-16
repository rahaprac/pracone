package com.prac.java;

import java.util.HashMap;
import java.util.Map;


public class TotalPairs {
    static int total = 10;
    static int[] givenArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < givenArray.length; i++) {
            int num = givenArray[i];
            int diff = total - num;
            if (!map.containsKey(num)) {
                map.put(diff, num);
            } else {
                System.out.println(num + "," + map.get(num));
            }

        }
    }
}

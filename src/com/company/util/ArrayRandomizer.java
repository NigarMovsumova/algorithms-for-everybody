package com.company.util;

import java.util.Random;

public class ArrayRandomizer {

    public static int [] fillArray(int length, int lowLimit, int highLimit) {
        int [] array = new int [length];

        Random rand = new Random();
        int bound = highLimit - lowLimit;
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(bound) + lowLimit;
        }
        return array;
    }
}

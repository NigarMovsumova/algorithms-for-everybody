package com.company.sorting;

import com.company.util.ArrayRandomizer;

import java.util.Arrays;

public class SelectionSort {

    private static int findMinElementIndex(int [] numbers, int lowerLimit) {
        int min = numbers [lowerLimit];
        int minElementIndex = lowerLimit;
        for (int i = lowerLimit + 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }


    private static void swapElements(int [] numbers, int leftIndex, int rightIndex) {
        int temp = numbers[leftIndex];
        numbers[leftIndex] = numbers[rightIndex];
        numbers[rightIndex] = temp;
    }

    private static int [] sortNumbers(int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = findMinElementIndex(numbers, i);
            swapElements(numbers, i, minIndex);
        }
        return numbers;
    }


    public static void main(String[] args) {
        int [] randomNumbers = ArrayRandomizer.fillArray(5, 0, 4);
        int [] predefinedNumbers = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sortNumbers(randomNumbers)));
        System.out.println(Arrays.toString(sortNumbers(predefinedNumbers)));
    }

}

package com.company.sorting;

import com.company.util.ArrayRandomizer;

import java.util.Arrays;

public class QuickSort {

    private static void sortNumbers(int [] numbers, int left, int right) {
        if (left >= right) return;
        int pivot = numbers[(left+ right)/2];
        int index = partition(numbers, left, right, pivot);
        sortNumbers(numbers, left, index - 1);
        sortNumbers(numbers, index, right);
    }

    private static int partition(int [] numbers, int left, int right, int pivot) {
        while (left <= right) {
            while (numbers[left] < pivot) {
                left++;
            }
            while (numbers[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(numbers, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int [] numbers, int left, int right) {
        int temp = numbers[left];
        numbers[left] = numbers[right];
        numbers[right] = temp;
    }

    public static void sortNumbers(int [] numbers) {
        sortNumbers(numbers, 0, numbers.length - 1);
    }

    public static void main(String[] args) {
        int [] randomNumbers = ArrayRandomizer.fillArray(5, 0, 4);
        int [] predefinedNumbers = new int[] {5, 4, 3, 2, 1};
        sortNumbers(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        sortNumbers(predefinedNumbers);
        System.out.println(Arrays.toString(predefinedNumbers));
    }
}

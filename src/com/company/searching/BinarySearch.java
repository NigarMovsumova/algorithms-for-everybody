package com.company.searching;

import com.company.util.ArrayRandomizer;
import com.company.util.LogFormatter;

import java.util.Arrays;
import java.util.logging.*;

import static com.company.util.LogFormatter.createLogRecord;
import static java.lang.String.format;

public class BinarySearch {

    private static Logger logger = Logger.getLogger(BinarySearch.class.getName());
    private static Formatter formatter = new LogFormatter(logger);

    /** Iterative implementation
     * @return int - index of a found element, otherwise it returns -1.
     * */
    private static int iterativeBinarySearch(int [] nums, int target) {
        if (nums == null) return -1;
        logger.log(createLogRecord(format("iterativeBinarySearch start for target : %s in nums: %s", target,
               Arrays.toString(nums))));
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    /** Recursive implementation
     * @return int - index of a found element, otherwise it returns -1.
     * */
    private static int recursiveBinarySearch(int [] nums, int target, int left, int right) {
        if (nums == null) return -1;
        logger.log(createLogRecord(format("recursiveBinarySearch start for target : %s in nums: %s", target,
                Arrays.toString(nums))));
        if (left >= right) return -1;
        int middle = left + (right - left) / 2;
        if (nums[middle] == target) return middle;
        else if (nums[middle] < target) return recursiveBinarySearch(nums, target, middle + 1, right);
        else return recursiveBinarySearch(nums, target, left, middle - 1);
    }

    public static void main(String[] args) {
            int [] randomNumbers = ArrayRandomizer.fillArray(5, 0, 4);
            int [] predefinedNumbers = new int[] {1, 2, 3, 4, 5};

            logger.log(createLogRecord(String.valueOf(iterativeBinarySearch(randomNumbers, 5))));
            logger.log(createLogRecord(String.valueOf(iterativeBinarySearch(predefinedNumbers, 5))));

            logger.log(createLogRecord(String.valueOf(recursiveBinarySearch(randomNumbers, 5, 0, 5))));
            logger.log(createLogRecord(String.valueOf(recursiveBinarySearch(predefinedNumbers, 5, 0, 5))));

    }
}

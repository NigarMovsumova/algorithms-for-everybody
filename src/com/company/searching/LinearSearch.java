package com.company.searching;

import com.company.util.ArrayRandomizer;
import com.company.util.LogFormatter;

import java.util.logging.Formatter;
import java.util.logging.Logger;

import static com.company.util.LogFormatter.createLogRecord;

public class LinearSearch {

    private static Logger logger = Logger.getLogger(BinarySearch.class.getName());
    private static Formatter formatter = new LogFormatter(logger);


    private static int findNumberIndex(int [] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] randomNumbers = ArrayRandomizer.fillArray(5, 0, 4);
        int [] predefinedNumbers = new int[] {1, 2, 3, 4, 5};

        logger.log(createLogRecord(String.valueOf(findNumberIndex(randomNumbers, 5))));
        logger.log(createLogRecord(String.valueOf(findNumberIndex(predefinedNumbers, 5))));
    }

}

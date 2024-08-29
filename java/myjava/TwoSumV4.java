package myjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumV4 {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] { numToIndex.get(target - nums[i]), i };
            }
            numToIndex.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumV4 twoSum = new TwoSumV4();

        var testNumber = 0;

        var nums = new int[] { 2, 7, 11, 15 };
        var target = 9;
        var expectedOutput = new int[] { 0, 1 };
        var output = twoSum.twoSum(nums, target);
        var testPassed = Arrays.equals(expectedOutput, output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        nums = new int[] { 3, 2, 4 };
        target = 6;
        expectedOutput = new int[] { 1, 2 };
        output = twoSum.twoSum(nums, target);
        testPassed = Arrays.equals(expectedOutput, output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        nums = new int[] { 3, 3 };
        target = 6;
        expectedOutput = new int[] { 0, 1 };
        output = twoSum.twoSum(nums, target);
        testPassed = Arrays.equals(expectedOutput, output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}
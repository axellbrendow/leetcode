package myjava;

import java.util.Arrays;
import java.util.HashSet;

class PartitionEqualSubsetSumV4 {
    public static boolean canPartition(int[] nums) {
        final var numsSum = Arrays.stream(nums).sum();

        if (nums.length == 1 || numsSum % 2 == 1)
            return false;

        // If both subsets should have the same sum, our target is half the array sum
        final var targetSum = numsSum / 2;
        final var sumsSet = new HashSet<Integer>();
        sumsSet.add(0);

        for (final var num : nums) {
            final var moreSums = new HashSet<Integer>();
            for (final var sum : sumsSet) {
                final var newSum = sum + num;
                if (newSum == targetSum)
                    return true;
                moreSums.add(newSum);
            }
            sumsSet.addAll(moreSums);
        }

        return false;
    }

    public static void main(String[] args) {
        var testNumber = 0;

        var nums = new int[] { 1, 5, 11, 5 };
        var expectedOutput = true;
        var output = canPartition(nums);
        var testPassed = output == expectedOutput;
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        nums = new int[] { 1, 2, 3, 5 };
        expectedOutput = false;
        output = canPartition(nums);
        testPassed = output == expectedOutput;
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        nums = new int[] { 2, 2, 3, 5 };
        expectedOutput = false;
        output = canPartition(nums);
        testPassed = output == expectedOutput;
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}

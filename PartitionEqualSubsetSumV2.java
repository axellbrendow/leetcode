// Time Limit Exceeded
// Time complexity: O(2^(n+1))
// Space complexity: O(2^(n+1))

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
nums = [1, 5, 11, 5]

left                               right
include in the subset    <---->    do not include in the subset

Decision tree:

                                            1
                    5                                               5
        11                      11                      11                      11
    5           5           5           5           5           5           5           5
x       x   x       x   x       x   x       x   x       x   x       x   x       x   x       x

2 ^ (n + 1)

where n is the length of the array
*/

class PartitionEqualSubsetSumV2 {
    public static boolean canPartition(int[] nums) {
        final var numsSum = Arrays.stream(nums).sum();

        if (nums.length == 1 || numsSum % 2 == 1)
            return false;

        // If both subsets should have the same sum, our target is half the array sum
        final var targetSum = numsSum / 2;

        final var subsets = includeAndDoNotIncludeIndex(0, nums);

        for (final var subset : subsets) {
            if (subset.stream().mapToInt(i -> i).sum() == targetSum) {
                return true;
            }
        }

        return false;
    }

    private static List<List<Integer>> includeAndDoNotIncludeIndex(int index, int[] nums) {
        if (index >= nums.length)
            return List.of(List.of());

        final var allSubsetsFromIndexPlus1 = includeAndDoNotIncludeIndex(index + 1, nums);

        final var allSubsetsFromIndexPlus1AddingCurrentIndex = new ArrayList<List<Integer>>();
        for (final var subset : allSubsetsFromIndexPlus1) {
            final var newSubsetAddingCurrentIndex = new ArrayList<Integer>(subset);
            newSubsetAddingCurrentIndex.add(nums[index]);
            allSubsetsFromIndexPlus1AddingCurrentIndex.add(newSubsetAddingCurrentIndex);
        }

        final var subsets = new ArrayList<List<Integer>>();
        subsets.addAll(allSubsetsFromIndexPlus1AddingCurrentIndex);
        subsets.addAll(allSubsetsFromIndexPlus1);
        return subsets;
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

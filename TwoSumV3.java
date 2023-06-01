import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

class TwoSumV3 {
    public int[] twoSum(int[] nums, int target) {
        final var numToIndices = new HashMap<Integer, Integer>();

        return IntStream.range(0, nums.length)
                .filter(index -> {
                    final var complementPresent = numToIndices.containsKey(target - nums[index]);
                    if (!complementPresent)
                        numToIndices.put(nums[index], index);
                    return complementPresent;
                })
                .mapToObj(index -> new int[] { numToIndices.get(target - nums[index]), index })
                .findFirst().get();
    }

    public static void main(String[] args) {
        TwoSumV3 twoSum = new TwoSumV3();

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
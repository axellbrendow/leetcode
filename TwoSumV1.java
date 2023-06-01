import java.util.Arrays;

class TwoSumV1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumV1 twoSum = new TwoSumV1();

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
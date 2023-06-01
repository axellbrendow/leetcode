import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwoSumV2 {
    public int[] twoSum(int[] nums, int target) {
        final var numToIndices = IntStream.range(0, nums.length).boxed()
                .collect(Collectors.groupingBy(index -> nums[index]));

        return Arrays.stream(nums)
                .filter(num -> num + num == target ? numToIndices.get(num).size() > 1
                        : numToIndices.containsKey(target - num))
                .mapToObj(num -> num + num == target
                        ? new int[] {
                                numToIndices.get(num).get(0),
                                numToIndices.get(num).get(1)
                        }
                        : new int[] {
                                numToIndices.get(num).get(0),
                                numToIndices.get(target - num).get(0)
                        })
                .findFirst().get();
    }

    public static void main(String[] args) {
        TwoSumV2 twoSum = new TwoSumV2();

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
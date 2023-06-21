import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

record ValueAndIndex(int value, int index) {
}

public class SlidingWindowMaximumV2 {
    private static int[] maxSlidingWindow(int[] nums, int k) {
        if (k <= 0)
            return new int[] {};

        List<Integer> output = new ArrayList<Integer>();
        Queue<ValueAndIndex> heap = new PriorityQueue<>(
                (valueAndIndex1, valueAndIndex2) -> valueAndIndex2.value() - valueAndIndex1.value());

        IntStream.range(0, k - 1)
                .forEach(i -> heap.offer(new ValueAndIndex(nums[i], i)));

        for (int i = k - 1; i < nums.length; i++) {
            heap.offer(new ValueAndIndex(nums[i], i));
            while (heap.peek().index() <= i - k) {
                heap.poll();
            }
            output.add(heap.peek().value());
        }

        return output.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        var testNumber = 0;

        var nums = new int[] { 10, 5, 2, 7, 8, 7 };
        var k = 1;
        var expectedOutput = new int[] { 10, 5, 2, 7, 8, 7 };
        var output = maxSlidingWindow(nums, k);
        var testPassed = Arrays.equals(expectedOutput, output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));

        nums = new int[] { 10, 5, 2, 7, 8, 7 };
        k = 3;
        expectedOutput = new int[] { 10, 7, 8, 8 };
        output = maxSlidingWindow(nums, k);
        testPassed = Arrays.equals(expectedOutput, output);
        System.out.println("Test " + ++testNumber + (testPassed ? " succeeded" : " failed"));
    }
}

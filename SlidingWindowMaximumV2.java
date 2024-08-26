import java.util.*;
import java.util.stream.*;

/*-
https://leetcode.com/problems/sliding-window-maximum/description/
*/

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
        assert Arrays.equals(maxSlidingWindow(new int[]{10,5,2,7,8,7}, 1), new int[]{10,5,2,7,8,7});
        assert Arrays.equals(maxSlidingWindow(new int[]{10,5,2,7,8,7}, 3), new int[]{10,7,8,8});
    }
}

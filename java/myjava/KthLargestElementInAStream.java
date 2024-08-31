package myjava;

import java.util.*;

class KthLargest {
  private int k;
  private Queue<Integer> heap = new PriorityQueue<>();

  public KthLargest(int k, int[] nums) {
    this.k = k;
    for (int num : nums) heap.offer(num);
    while (heap.size() > k) heap.poll();
  }

  public int add(int val) {
    if (heap.size() < k) heap.offer(val);
    else if (val > heap.peek()) {
      heap.poll();
      heap.offer(val);
    }
    return heap.peek();
  }
}

public class KthLargestElementInAStream {
  public static void main(String[] args) {
    KthLargest kthLargest;

    kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
    assert kthLargest.add(3) == 4;
    assert kthLargest.add(5) == 5;
    assert kthLargest.add(10) == 5;
    assert kthLargest.add(9) == 8;
    assert kthLargest.add(4) == 8;

    kthLargest = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
    assert kthLargest.add(2) == 7;
    assert kthLargest.add(10) == 7;
    assert kthLargest.add(9) == 7;
    assert kthLargest.add(9) == 8;
  }
}

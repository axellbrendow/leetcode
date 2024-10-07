package myjava;

/*-
https://leetcode.com/problems/contains-duplicate/description/

Given an integer array nums, return true if any value appears at least twice in the array, and return false if
every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/

public class ContainsDuplicateV2 {
  // Boyer–Moore majority vote algorithm
  private static int getMostFrequentElement(int[] nums) {
    int counter = 1, element = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (element == nums[i]) counter++;
      else counter--;

      if (counter == 0) {
        counter = 1;
        element = nums[i];
      }
    }
    return element;
  }

  public static boolean containsDuplicate(int[] nums) {
    int mostFrequentElement = getMostFrequentElement(nums);
    int count = 0;
    for (int num : nums)
      if (num == mostFrequentElement) count++;
    return count >= 2;
  }

  public static void main(String[] args) {
    assert containsDuplicate(new int[]{1, 2, 3, 4}) == false;
    assert containsDuplicate(new int[]{1, 1, 1, 3}) == true;
    assert containsDuplicate(new int[]{1, 2, 3, 1}) == true;
  }
}

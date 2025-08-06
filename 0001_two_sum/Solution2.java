import java.util.*;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    // value -> index
    HashMap<Integer, Integer> prevElem = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      // Get the difference of the target and nums elem
      int diff = target - nums[i];

      // Checks if the HashMap contains the previous element
      if (prevElem.containsKey(diff)) {

        // Return the indices of the two sum
        return new int[] {prevElem.get(diff), i};
      }

      // Else add the element in the HashMap
      prevElem.put(nums[i], i);
    }
    return new int[] {}; // Return empty if no solution
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = {3, 2, 4};
    int[] result = sol.twoSum(arr, 6);
    for (int i : result) {
      System.out.println(i);
    }
  }
}

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums , int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int [] {};
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        int [] arr = {3,2,4};
        int [] result = sol.twoSum(arr, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

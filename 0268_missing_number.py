"""
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
"""


class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        res = len(nums)
        print(res)

        for i in range(len(nums)):
            print(f"element {i}: {nums[i]}\n {i} - {nums[i]} = {i - nums[i]}")
            res += i - nums[i]
            print(f"Result: {res}")
        return res


sol = Solution()
print(sol.missingNumber([1, 0, 3]))


"""
Alternative:
total = sum(range(0, len(nums) + 1))
actualSum = sum(nums)
return total - actualSum
"""

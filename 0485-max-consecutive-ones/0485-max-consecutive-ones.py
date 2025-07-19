class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        res = 0
        cur = 0

        # n = len(nums)
        # for i in range(n):
        #     if nums[i] == 1:
        #         cur += 1
        #     elif nums[i] == 0:
        #         cur = 0
        #     if res < cur:
        #         res = cur

        for n in nums:
            if n:
                cur += 1
                if cur > res:
                    res = cur
            else:
                cur = 0
        return res


sol = Solution()
print(sol.findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1]))

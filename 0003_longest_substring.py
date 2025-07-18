class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        l = 0
        res = 0
        print("Input length: ", len(s))
        print(s)
        for r in range(len(s)):
            while s[r] in charSet:
                charSet.remove(s[l])
                l += 1
            charSet.add(s[r])
            res = max(res, r - l + 1)
            print(f"Charset: {charSet}")
        return res


sol = Solution()
print(sol.lengthOfLongestSubstring("abcabcbb"))
"""
Output: 3
"""

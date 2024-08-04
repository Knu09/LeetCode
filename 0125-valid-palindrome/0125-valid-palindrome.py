class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_str = "".join(char for char in s if char.isalnum()).lower()
        return clean_str == clean_str[::-1]
    
    
class Solution:
    def isPalindrome(self, s: str) -> bool:
        pal_str = "".join(ch.lower() for ch in s if ch.isalnum())

        return pal_str == "".join(reversed(pal_str))

class Solution:
    def isValid(self, s: str) -> bool:
        mapping = {")": "(", "]": "[", "}": "{"}
        stack = []
        for ch in s:
            if ch in mapping:
                if stack:
                    top_ele = stack.pop()
                else:
                    top_ele = "#"

                if mapping[ch] != top_ele:
                    return False
            else:
                stack.append(ch)

        return not stack

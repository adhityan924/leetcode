class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        start = 0
        end = 0
        fmap = {}
        res = 0
        maxf = 0
        for end in range(len(s)):
            fmap[s[end]] = fmap.get(s[end], 0) + 1
            maxf = max(maxf, fmap[s[end]])
            is_valid = end - start + 1 - maxf <= k
            if not is_valid:
                fmap[s[start]] -= 1
                start += 1

            res = max(res, end - start + 1)

        return res

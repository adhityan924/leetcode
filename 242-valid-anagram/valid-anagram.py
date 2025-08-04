class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}
        for ch in s:
            if ch in smap:
                smap[ch] += 1
            else:
                smap[ch] = 1

        for ch in t:
            if ch in tmap:
                tmap[ch] += 1
            else:
                tmap[ch] = 1

        if smap == tmap:
            return True
        else:
            return False

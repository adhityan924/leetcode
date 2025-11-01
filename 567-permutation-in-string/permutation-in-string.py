class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1map = {}
        s2map = {}

        for i in range(len(s1)):
            if s1[i] not in s1map:
                s1map[s1[i]] = 0
            s1map[s1[i]] += 1

            if s2[i] not in s2map:
                s2map[s2[i]] = 0
            s2map[s2[i]] += 1

        if s1map == s2map:
            return True
        n = len(s1)
        for i in range(n, len(s2)):
            if s2[i] not in s2map:
                s2map[s2[i]] = 0
            s2map[s2[i]] += 1

            s2map[s2[i - n]] -= 1
            if s2map[s2[i - n]] == 0:
                del s2map[s2[i - n]]
            if s2map == s1map:
                return True

        return False

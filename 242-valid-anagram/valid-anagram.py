class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s_map = {}
        t_map = {}

        for c in s:
            if c not in s_map:
                s_map[c]=0
            s_map[c]+=1

        for c in t:
            if c not in t_map:
                t_map[c]=0
            t_map[c]+=1
        
        if s_map == t_map:
            return True
        else:
            return False
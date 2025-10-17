class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}

        for s in strs:
            sort_str = "".join(sorted(s))
            if sort_str not in map:
                map[sort_str]=[]
            map[sort_str].append(s)

        return list(map.values())
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for str1 in strs:
            sort_str = ''.join(sorted(str1))
            if sort_str in map:
                map[sort_str].append(str1)
            else:
                map[sort_str] = [str1]
        return list(map.values())
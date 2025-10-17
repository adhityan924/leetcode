class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = Counter(nums)
        res = []
        for x,y in map.most_common(k):
            res.append(x)
        return res
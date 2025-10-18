class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        max_seq = 0
        for num in num_set:
            if num - 1 not in num_set:
                streak = 0
                while num in num_set:
                    streak += 1
                    num += 1

                max_seq = max(max_seq, streak)

        return max_seq

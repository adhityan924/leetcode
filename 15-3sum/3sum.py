class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        sort_nums = sorted(nums)
        res = []
        for i in range(len(sort_nums)):
            if sort_nums[i] > 0:
                break
            if i == 0 or sort_nums[i - 1] != sort_nums[i]:
                self.twoSum(sort_nums, i, res)
        return res

    def twoSum(self, nums: List[int], i: int, res: List[List[int]]) -> None:
        lo = i + 1
        hi = len(nums) - 1

        while lo < hi:
            sum = nums[lo] + nums[hi] + nums[i]
            if sum < 0:
                lo += 1
            elif sum > 0:
                hi -= 1
            else:
                res.append([nums[i], nums[lo], nums[hi]])
                lo += 1
                hi -= 1
                while lo < hi and nums[lo] == [lo - 1]:
                    lo += 1
                while lo < hi and nums[hi] == nums[hi + 1]:
                    hi -= 1

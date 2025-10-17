class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        r = 1
        l = 1

        for i in range(len(nums)):
            res[i] *= l
            l *= nums[i]

        for i in reversed(range(len(nums))):
            res[i] *= r
            r *= nums[i]

        return res

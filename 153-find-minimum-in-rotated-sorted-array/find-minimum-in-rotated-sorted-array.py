class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        low = 0
        high = len(nums) - 1

        if nums[0] < nums[high]:
            return nums[0]

        while low <= high:
            mid = (low + high) // 2

            if nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            if nums[mid] < nums[mid - 1]:
                return nums[mid]

            if nums[0] < nums[mid]:
                low = mid + 1
            else:
                high = mid - 1

        return -1

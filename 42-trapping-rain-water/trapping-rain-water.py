class Solution:
    def trap(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        leftmax, rightmax = 0, 0
        ans = 0

        while l < r:
            if height[l] < height[r]:
                leftmax = max(leftmax, height[l])
                ans += leftmax - height[l]
                l += 1
            else:
                rightmax = max(rightmax, height[r])
                ans += rightmax - height[r]
                r -= 1

        return ans

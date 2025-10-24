class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        low = 0
        high = (m * n) - 1

        while low <= high:
            ind = (low + high) // 2
            val = matrix[ind // n][ind % n]

            if val == target:
                return True

            elif val < target:
                low = ind + 1
            else:
                high = ind - 1

        return False

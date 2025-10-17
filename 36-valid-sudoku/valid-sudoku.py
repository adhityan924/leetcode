class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        box = [set() for _ in range(9)]

        for r in range(9):
            for c in range(9):
                ch = board[r][c]
                ind = int((r // 3) * 3 + (c // 3))

                if ch == ".":
                    continue

                if (ch in rows[r]) or (ch in cols[c]) or (ch in box[ind]):
                    return False

                rows[r].add(ch)
                cols[c].add(ch)
                box[ind].add(ch)

        return True

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        self.bcktrk("", 0, 0, res, n)
        return res

    def bcktrk(self, s: str, left: int, right: int, res: List[str], n: int) -> None:
        if len(s) == 2 * n:
            res.append(s)
            return

        if left < n:
            self.bcktrk(s + "(", left + 1, right, res, n)

        if right < left:
            self.bcktrk(s + ")", left, right + 1, res, n)

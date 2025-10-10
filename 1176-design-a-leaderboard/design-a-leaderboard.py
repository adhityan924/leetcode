class Leaderboard:

    def __init__(self):
        self.board = {}

    def addScore(self, playerId: int, score: int) -> None:
        if playerId not in self.board:
            self.board[playerId] = 0
        self.board[playerId] += score

    def top(self, K: int) -> int:
        heap = []
        topScore = 0
        for x in self.board.values():
            heapq.heappush(heap, x)
            if len(heap) > K:
                heapq.heappop(heap)

        while heap:
            topScore += heapq.heappop(heap)
        return topScore

    def reset(self, playerId: int) -> None:
        self.board[playerId] = 0


# Your Leaderboard object will be instantiated and called as such:
# obj = Leaderboard()
# obj.addScore(playerId,score)
# param_2 = obj.top(K)
# obj.reset(playerId)

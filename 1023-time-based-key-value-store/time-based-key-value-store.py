class TimeMap:

    def __init__(self):
        self.time_map = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.time_map:
            self.time_map[key] = SortedDict()
        self.time_map[key][timestamp] = value

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.time_map:
            return ""
        ind = self.time_map[key].bisect_right(timestamp)
        if ind == 0:
            return ""
        return self.time_map[key].peekitem(ind - 1)[1]


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)

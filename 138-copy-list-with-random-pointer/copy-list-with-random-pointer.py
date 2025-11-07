"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""


class Solution:
    def copyRandomList(self, head: "Optional[Node]") -> "Optional[Node]":
        if not head:
            return None

        visited = {}

        def getClonedNode(node):
            if not node:
                return None
            if node in visited:
                return visited[node]
            visited[node] = Node(node.val)
            return visited[node]

        cur = head
        new_head = Node(head.val)
        visited[cur] = new_head

        while cur:
            clone = visited[cur]
            clone.random = getClonedNode(cur.random)
            clone.next = getClonedNode(cur.next)
            cur = cur.next

        return visited[head]

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        ptr = head
        newhead = None
        ktail = None

        while ptr:
            ptr = head
            i = 0

            while i < k and ptr:
                ptr = ptr.next
                i += 1

            if i == k:

                revhead = self.reverselinkedlist(head, k)

                if not newhead:
                    newhead = revhead

                if ktail:
                    ktail.next = revhead

                ktail = head
                head = ptr

        if ktail:
            ktail.next = head

        return newhead if newhead else head

    def reverselinkedlist(self, head, k):
        prev = None
        curr = head

        while k > 0:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            k -= 1

        return prev

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(
        self, l1: Optional[ListNode], l2: Optional[ListNode]
    ) -> Optional[ListNode]:

        temp = ListNode(0)

        curr = temp
        carry = 0

        while l1 is not None or l2 is not None or carry != 0:
            l1val = l1.val if l1 is not None else 0
            l2val = l2.val if l2 is not None else 0

            colSum = l1val + l2val + carry
            carry = int(colSum / 10)

            resNode = ListNode(colSum % 10)

            curr.next = resNode
            curr = curr.next
            l1 = l1.next if l1 is not None else None
            l2 = l2.next if l2 is not None else None

        return temp.next

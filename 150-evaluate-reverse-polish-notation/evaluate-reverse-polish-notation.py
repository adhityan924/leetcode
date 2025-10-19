class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            if token not in "+-*/":
                stack.append(int(token))
                continue

            val1 = stack.pop()
            val2 = stack.pop()

            if token == "+":
                val = val1 + val2
            elif token == "-":
                val = val2 - val1
            elif token == "/":
                val = int(val2 / val1)
            elif token == "*":
                val = val1 * val2

            stack.append(val)

        return stack[-1]

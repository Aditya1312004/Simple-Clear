class Solution:
    def reorderedPowerOf2(self, n: int) -> bool:
        dp= {''.join(sorted(str(1 << i))) for i in range(30)}
        return ''.join(sorted(str(n))) in dp
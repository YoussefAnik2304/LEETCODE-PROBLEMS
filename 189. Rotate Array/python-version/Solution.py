from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        tmp = [0] * len(nums)  # Initialize tmp list with zeros
        for i in range(len(nums)):
            tmp[(i + k) % len(nums)] = nums[i]
        nums[:] = tmp

from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buyprice = prices[0]
        maxProfit = 0
        for price in prices:
            if price < buyprice:
                buyprice = price
            elif (price - buyprice > maxProfit):
                maxProfit = price - buyprice
        return maxProfit

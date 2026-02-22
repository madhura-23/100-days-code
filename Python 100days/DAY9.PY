class Solution(object):
    def maxProfit(self, prices):
        max_profit = 0
        n = len(prices)

        for i in range(1, n):
            if prices[i - 1] < prices[i]:
                max_profit += (prices[i] - prices[i - 1])

        return max_profit
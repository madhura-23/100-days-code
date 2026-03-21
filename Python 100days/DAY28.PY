class Solution:
    def reverseSubmatrix(self, grid, x, y, k):
        top = x
        bottom = x + k - 1

        while top < bottom:
            for c in range(y, y + k):
                grid[top][c], grid[bottom][c] = grid[bottom][c], grid[top][c]
            top += 1
            bottom -= 1

        return grid

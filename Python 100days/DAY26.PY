class Solution:
    def numberOfSubmatrices(self, grid):
        m, n = len(grid), len(grid[0])
        ps = [[0]*n for _ in range(m)]
        countX = [[0]*n for _ in range(m)]

        for i in range(m):
            for j in range(n):
                val = 1 if grid[i][j] == 'X' else (-1 if grid[i][j] == 'Y' else 0)

                ps[i][j] = val
                if i > 0: ps[i][j] += ps[i-1][j]
                if j > 0: ps[i][j] += ps[i][j-1]
                if i > 0 and j > 0: ps[i][j] -= ps[i-1][j-1]

                x = 1 if grid[i][j] == 'X' else 0
                countX[i][j] = x
                if i > 0: countX[i][j] += countX[i-1][j]
                if j > 0: countX[i][j] += countX[i][j-1]
                if i > 0 and j > 0: countX[i][j] -= countX[i-1][j-1]

        ans = 0
        for i in range(m):
            for j in range(n):
                if ps[i][j] == 0 and countX[i][j] > 0:
                    ans += 1
        return ans

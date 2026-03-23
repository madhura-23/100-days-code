class Solution:
    def maxProductPath(self, grid: List[List[int]]) -> int:
        
        n , m = len(grid) , len(grid[0])
        ans = [[[0,0] for _ in range(m)] for _ in range(n)]
        mod = 10 ** 9 + 7
        
        ans[0][0] = [grid[0][0] ,grid[0][0]]
        for i in range(1,m) :
            ans[0][i] = [ans[0][i-1][0] * grid[0][i] , ans[0][i-1][0] * grid[0][i]]
           

        for i in range(1,n) :
            ans[i][0] = [ ans[i-1][0][0] * grid[i][0] , ans[i-1][0][0] * grid[i][0]]
            


        for i in range(1,n) :
            for j in range(1,m) :
                low =  min(ans[i-1][j][0]*grid[i][j] ,ans[i-1][j][1]*grid[i][j] , ans[i][j-1][0]*grid[i][j] , ans[i][j-1][1]*grid[i][j])
                high = max(ans[i-1][j][0]*grid[i][j] ,ans[i-1][j][1]*grid[i][j] , ans[i][j-1][0]*grid[i][j] , ans[i][j-1][1]*grid[i][j])
                ans[i][j] = [low , high]

        # print(ans)
        # return 1

        a, b = ans[n-1][m-1]
        if a < 0 and b < 0 :
            return -1
        elif a >= 0 and b < 0 :
            return a % mod
        elif b >= 0 and a < 0 :
            return b % mod 
        elif a >= 0 and b >= 0 :
            return max(a,b) % mod
        else :
            pass


            

        

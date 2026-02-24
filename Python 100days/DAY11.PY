class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int: # pyright: ignore[reportUndefinedVariable]

        def dfs(node: TreeNode, n = 0)-> None: # pyright: ignore[reportUndefinedVariable]
            if not node: return

            n = 2 * n + node.val
            if not node.left and not node.right:
                self.ans+= n
                return
                
            dfs(node.left , n)
            dfs(node.right, n)
            return
            

        self.ans = 0
        dfs(root)
        return self.ans
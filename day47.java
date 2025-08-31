public class day47 {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            // Compute depths of left and right subtrees
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            // Current node depth = max(left, right) + 1
            return Math.max(left, right) + 1;
        }
    }
}

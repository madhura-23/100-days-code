public class day52 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        findBase(root, targetSum);
        return total;
    }
    private void findBase(TreeNode root, int target){
        if(root == null){
            return;
        }
        find(root, target, 0L);
        findBase(root.left, target);
        findBase(root.right, target);
    }
    private void find(TreeNode root, int target, long curr){
        if(root == null){
            return;
        }
        curr += root.val;
        if(curr == target){
            total++;
        }
        find(root.left, target, curr);
        find(root.right, target, curr);
    }
}
}

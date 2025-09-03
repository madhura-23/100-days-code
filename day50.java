public class day50{
}
class Solution {

    // Record the maximum value along the path from the root to the node.
    public int countGoodNodes(TreeNode node, int max){
        if(node == null) return 0;
        
        // Check if I am a good node myself? Also, update max if it is, for its child nodes.
        boolean isGoodNode = false;
        if(node.val >= max){
            isGoodNode = true;
            max = node.val;
        } 

        // ask your left and right subtrees to get the good nodes.
        int left = countGoodNodes(node.left, max); 
        int right = countGoodNodes(node.right, max);

        // return the total good nodes 
        return isGoodNode ? (left + right + 1) : (left + right);
    }

    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return countGoodNodes(root, Integer.MIN_VALUE);
    }
}

import java.util.ArrayList;
import java.util.List;

public class day55 {
    class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        rightview(root,res,0);
        return res;
    }
    public void rightview(TreeNode root, List<Integer> res, int level)
    {
        if(root==null) return ;
        if (level==res.size())
        {
            res.add(root.val);
        }
        rightview(root.right,res,level+1);
        rightview(root.left,res,level+1);
        

    }
}
}

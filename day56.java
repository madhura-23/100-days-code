import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class day56{
        public int maxLevelSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        return 1 + IntStream.range(0, list.size()).reduce(0, (a, b) -> list.get(a) < list.get(b) ? b : a);
    }
    private void dfs(TreeNode n, List<Integer> l, int level) {
        if (n == null) { return; } 
        if (l.size() == level) { l.add(n.val); } // never reach this level before, add first value.
        else { l.set(level, l.get(level) + n.val); } // reached the level before, accumulate current value to old value.
        dfs(n.left, l, level + 1);
        dfs(n.right, l, level + 1);
    }
}
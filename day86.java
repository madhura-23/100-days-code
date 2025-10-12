import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class day86{
    class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> rev_adj = new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
            rev_adj.add(new ArrayList<>());
        }

        for(int i=0; i<n-1; i++){
            int u = connections[i][0];
            int v = connections[i][1];

            adj.get(u).add(v);
            rev_adj.get(v).add(u);
        }

        Deque<Integer> dq = new LinkedList<>();
        boolean[] vis = new boolean[n];
        int cnt = 0;
        dq.add(0);

        while(!dq.isEmpty()){
            int node = dq.poll();
            vis[node] = true;

            for(int it : adj.get(node)){
                if(!vis[it]){
                    dq.add(it);
                    cnt++;
                }
            }

            for(int it : rev_adj.get(node)){
                if(!vis[it]){
                    dq.add(it);
                }
            }
        }

        return cnt;
    }
}
}
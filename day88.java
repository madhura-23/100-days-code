import java.util.PriorityQueue;

public class day88{
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Max-heap (largest element at the top)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        // Add all elements
        for (int num : nums) {
            pq.add(num);
        }

        // Remove top (k-1) times
        while (k > 1) {
            pq.poll();
            k--;
        }

        // k-th largest element
        return pq.poll();
    }
}
}
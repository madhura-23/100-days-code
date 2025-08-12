public class day28 {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        double maxSum = 0;

        // Check for edge case
        if (nums.length < k) {
            System.out.println("Invalid: Window size is larger than array.");
            return -1;
        }

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum/k;
    }
}

